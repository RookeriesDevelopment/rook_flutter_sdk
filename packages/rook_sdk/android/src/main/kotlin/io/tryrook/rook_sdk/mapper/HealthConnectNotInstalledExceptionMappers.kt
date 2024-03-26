package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.HealthConnectNotInstalledException
import io.tryrook.rook_sdk.proto.HealthConnectNotInstalledExceptionProto

fun HealthConnectNotInstalledException.toProto(): HealthConnectNotInstalledExceptionProto {
    return HealthConnectNotInstalledExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
