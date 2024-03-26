package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.MissingPermissionsException
import io.tryrook.rook_sdk.proto.MissingPermissionsExceptionProto

fun MissingPermissionsException.toProto(): MissingPermissionsExceptionProto {
    return MissingPermissionsExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
