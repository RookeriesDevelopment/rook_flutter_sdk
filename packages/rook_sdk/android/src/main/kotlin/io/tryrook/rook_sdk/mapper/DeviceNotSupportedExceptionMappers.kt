package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.DeviceNotSupportedException
import io.tryrook.rook_sdk.proto.DeviceNotSupportedExceptionProto

fun DeviceNotSupportedException.toProto(): DeviceNotSupportedExceptionProto {
    return DeviceNotSupportedExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
