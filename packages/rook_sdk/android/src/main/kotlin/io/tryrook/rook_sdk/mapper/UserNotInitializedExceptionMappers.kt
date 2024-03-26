package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.exception.UserNotInitializedException
import io.tryrook.rook_sdk.proto.UserNotInitializedExceptionProto

fun UserNotInitializedException.toProto(): UserNotInitializedExceptionProto {
    return UserNotInitializedExceptionProto.newBuilder()
        .setMessage(message)
        .build()
}
