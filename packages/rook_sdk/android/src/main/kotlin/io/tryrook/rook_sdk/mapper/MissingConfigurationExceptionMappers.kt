package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.MissingConfigurationException
import io.tryrook.rook_sdk.proto.MissingConfigurationExceptionProto

fun MissingConfigurationException.toProto(): MissingConfigurationExceptionProto {
    return MissingConfigurationExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
