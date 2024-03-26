package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.enums.HealthPermission
import io.tryrook.rook_sdk.exception.UnknownPermissionException
import io.tryrook.rook_sdk.proto.HealthPermissionProto

fun HealthPermissionProto.toDomain(): HealthPermission {
    return when (this) {
        HealthPermissionProto.SLEEP -> HealthPermission.SLEEP
        HealthPermissionProto.PHYSICAL -> HealthPermission.PHYSICAL
        HealthPermissionProto.BODY -> HealthPermission.BODY
        HealthPermissionProto.ALL -> HealthPermission.ALL
        else -> throw UnknownPermissionException()
    }
}
