package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.SDKNotInitializedException
import io.tryrook.rook_sdk.proto.SDKNotInitializedExceptionProto

fun SDKNotInitializedException.toProto(): SDKNotInitializedExceptionProto {
    return SDKNotInitializedExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
