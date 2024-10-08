package com.rookmotion.rook_sdk_health_connect.extension

import com.rookmotion.rook.sdk.domain.model.DataSource
import com.rookmotion.rook_sdk_health_connect.proto.DataSourcesProtoListWrapper
import com.rookmotion.rook_sdk_health_connect.proto.PluginExceptionProto
import com.rookmotion.rook_sdk_health_connect.proto.ResultDataSourcesProto
import com.rookmotion.rook_sdk_health_connect.mapper.toDataSourceProto
import io.flutter.plugin.common.MethodChannel

fun MethodChannel.Result.dataSourcesSuccess(dataSources: List<DataSource>) {
    val dataSourcesProtoListWrapper = DataSourcesProtoListWrapper.newBuilder()
        .addAllDataSources(dataSources.map { it.toDataSourceProto() })
        .build()

    val bytes = ResultDataSourcesProto.newBuilder()
        .setDataSourcesProtoListWrapper(dataSourcesProtoListWrapper)
        .build()
        .toByteArray()

    success(bytes)
}

fun MethodChannel.Result.dataSourcesError(throwable: Throwable) {
    val pluginExceptionProto = PluginExceptionProto.newBuilder()
        .setId(throwable.getPluginExceptionId())
        .setCode(throwable.getPluginExceptionCode())
        .setMessage(throwable.getPluginExceptionMessage())

    val bytes = ResultDataSourcesProto.newBuilder()
        .setPluginExceptionProto(pluginExceptionProto)
        .build()
        .toByteArray()

    success(bytes)
}
