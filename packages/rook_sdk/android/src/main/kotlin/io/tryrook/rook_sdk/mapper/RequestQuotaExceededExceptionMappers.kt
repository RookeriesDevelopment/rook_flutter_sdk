package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.RequestQuotaExceededException
import io.tryrook.rook_sdk.proto.RequestQuotaExceededExceptionProto

fun RequestQuotaExceededException.toProto(): RequestQuotaExceededExceptionProto {
    return RequestQuotaExceededExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}