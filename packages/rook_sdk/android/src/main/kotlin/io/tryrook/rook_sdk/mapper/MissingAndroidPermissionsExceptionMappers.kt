package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.MissingAndroidPermissionsException
import io.tryrook.rook_sdk.proto.MissingAndroidPermissionsExceptionProto

fun MissingAndroidPermissionsException.toProto(): MissingAndroidPermissionsExceptionProto {
    return MissingAndroidPermissionsExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
