package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.HttpRequestException
import io.tryrook.rook_sdk.proto.HttpRequestExceptionProto

fun HttpRequestException.toProto(): HttpRequestExceptionProto {
    return HttpRequestExceptionProto.newBuilder()
        .setMessage(message)
        .setCode(code)
        .build()
}
