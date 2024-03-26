package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.TimeoutException
import io.tryrook.rook_sdk.proto.TimeoutExceptionProto

fun TimeoutException.toProto(): TimeoutExceptionProto {
    return TimeoutExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
