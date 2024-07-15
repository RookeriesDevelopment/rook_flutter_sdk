package com.rookmotion.rook_sdk_health_connect.handler

import android.content.Context
import com.rookmotion.rook.sdk.RookDataSources
import com.rookmotion.rook_sdk_health_connect.MethodResult
import com.rookmotion.rook_sdk_health_connect.extension.resultBooleanError
import com.rookmotion.rook_sdk_health_connect.extension.resultBooleanSuccess
import com.rookmotion.rook_sdk_health_connect.extension.resultDataSourcesError
import com.rookmotion.rook_sdk_health_connect.extension.resultDataSourcesSuccess
import io.flutter.plugin.common.MethodCall
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class DataSourcesHandler(context: Context, private val coroutineScope: CoroutineScope) {

    private val rookDataSources = RookDataSources(context)

    fun onMethodCall(methodCall: MethodCall, methodResult: MethodResult) {
        when (methodCall.method) {
            "getAvailableDataSources" -> coroutineScope.launch {
                rookDataSources.getAvailableDataSources().fold(
                    {
                        methodResult.resultDataSourcesSuccess(it)
                    },
                    {
                        methodResult.resultDataSourcesError(it)
                    }
                )
            }

            "presentDataSourceView" -> coroutineScope.launch {
                rookDataSources.presentDataSourceView().fold(
                    {
                        methodResult.resultBooleanSuccess(true)
                    },
                    {
                        methodResult.resultBooleanError(it)
                    }
                )
            }

            else -> Unit
        }
    }
}
