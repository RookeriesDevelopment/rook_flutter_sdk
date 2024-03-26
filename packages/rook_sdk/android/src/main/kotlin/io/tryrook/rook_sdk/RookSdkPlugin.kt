package io.tryrook.rook_sdk

import android.content.Context
import com.rookmotion.rook.sdk.RookConfigurationManager
import com.rookmotion.rook.sdk.RookHealthPermissionsManager
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.tryrook.rook_sdk.extension.getIntArgAt
import io.tryrook.rook_sdk.extension.resultBooleanError
import io.tryrook.rook_sdk.extension.resultBooleanSuccess
import io.tryrook.rook_sdk.mapper.toDomain
import io.tryrook.rook_sdk.permissions.HealthConnectPermissionsActivity
import io.tryrook.rook_sdk.proto.HealthPermissionProto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class RookSdkPlugin : FlutterPlugin, MethodCallHandler {
    private lateinit var channel: MethodChannel

    private var context: Context? = null

    private lateinit var rookConfigurationManager: RookConfigurationManager
    private lateinit var rookHealthPermissionsManager: RookHealthPermissionsManager

    override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        context = flutterPluginBinding.applicationContext

        rookConfigurationManager = RookConfigurationManager(flutterPluginBinding.applicationContext)
        rookHealthPermissionsManager = RookHealthPermissionsManager(rookConfigurationManager)

        channel = MethodChannel(flutterPluginBinding.binaryMessenger, "rook_sdk")
        channel.setMethodCallHandler(this)
    }

    override fun onMethodCall(call: MethodCall, result: Result) {
        when (call.method) {
            "requestPermissions" -> {
                val healthPermission = call.getIntArgAt(0).let {
                    HealthPermissionProto.forNumber(it).toDomain()
                }

                try {
                    HealthConnectPermissionsActivity.launch(context!!, healthPermission)

                    result.resultBooleanSuccess(true)
                } catch (exception: NullPointerException) {
                    result.resultBooleanError(exception)
                }
            }

            else -> result.notImplemented()
        }
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
    }
}
