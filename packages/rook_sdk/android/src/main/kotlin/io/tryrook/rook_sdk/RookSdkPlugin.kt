package io.tryrook.rook_sdk

import android.content.Context
import com.rookmotion.rook.sdk.RookConfigurationManager
import com.rookmotion.rook.sdk.RookHealthPermissionsManager
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.tryrook.rook_sdk.extension.getIntArgAt
import io.tryrook.rook_sdk.extension.intSuccess
import io.tryrook.rook_sdk.extension.resultBooleanError
import io.tryrook.rook_sdk.extension.resultBooleanSuccess
import io.tryrook.rook_sdk.extension.throwableError
import io.tryrook.rook_sdk.functions.CHECK_AVAILABILITY
import io.tryrook.rook_sdk.functions.CHECK_PERMISSIONS
import io.tryrook.rook_sdk.functions.OPEN_HEALTH_CONNECT_SETTINGS
import io.tryrook.rook_sdk.functions.REQUEST_PERMISSIONS
import io.tryrook.rook_sdk.functions.permissionsFunctions
import io.tryrook.rook_sdk.mapper.toDomain
import io.tryrook.rook_sdk.mapper.toProto
import io.tryrook.rook_sdk.permissions.HealthConnectPermissionsActivity
import io.tryrook.rook_sdk.proto.HealthPermissionProto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class RookSdkPlugin : FlutterPlugin, MethodCallHandler {
    private lateinit var scope: CoroutineScope
    private lateinit var channel: MethodChannel

    private var context: Context? = null

    private lateinit var rookConfigurationManager: RookConfigurationManager
    private lateinit var rookHealthPermissionsManager: RookHealthPermissionsManager

    override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        context = flutterPluginBinding.applicationContext

        rookConfigurationManager = RookConfigurationManager(flutterPluginBinding.applicationContext)
        rookHealthPermissionsManager = RookHealthPermissionsManager(rookConfigurationManager)

        scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
        channel = MethodChannel(flutterPluginBinding.binaryMessenger, "rook_sdk")
        channel.setMethodCallHandler(this)
    }

    override fun onMethodCall(call: MethodCall, result: MethodChannel.Result) {
        when (call.method) {
            in permissionsFunctions -> handlePermissionsFunction(call, result)
            else -> result.notImplemented()
        }
    }

    private fun handlePermissionsFunction(methodCall: MethodCall, result: MethodChannel.Result) {
        when (methodCall.method) {
            CHECK_AVAILABILITY -> {
                try {
                    val availabilityStatus = RookHealthPermissionsManager.checkAvailability(context!!)
                    val proto = availabilityStatus.toProto()

                    result.intSuccess(proto.number)
                } catch (exception: NullPointerException) {
                    result.throwableError(exception)
                }
            }

            OPEN_HEALTH_CONNECT_SETTINGS -> scope.launch {
                rookHealthPermissionsManager.openHealthConnectSettings().fold(
                    {
                        result.resultBooleanSuccess(true)
                    },
                    {
                        result.resultBooleanError(it)
                    }
                )
            }

            CHECK_PERMISSIONS -> scope.launch {
                val healthPermission = methodCall.getIntArgAt(0).let {
                    HealthPermissionProto.forNumber(it).toDomain()
                }

                rookHealthPermissionsManager.checkPermissions(healthPermission).fold(
                    {
                        result.resultBooleanSuccess(it)
                    },
                    {
                        result.resultBooleanError(it)
                    }
                )
            }

            REQUEST_PERMISSIONS -> {
                val healthPermission = methodCall.getIntArgAt(0).let {
                    HealthPermissionProto.forNumber(it).toDomain()
                }

                try {
                    HealthConnectPermissionsActivity.launch(context!!, healthPermission)

                    result.resultBooleanSuccess(true)
                } catch (exception: NullPointerException) {
                    result.resultBooleanError(exception)
                }
            }
        }
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        scope.cancel()
        channel.setMethodCallHandler(null)
    }
}
