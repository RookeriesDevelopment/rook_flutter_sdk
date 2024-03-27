package io.tryrook.rook_sdk.mapper

import com.rookmotion.rook.sdk.domain.enums.AvailabilityStatus
import io.tryrook.rook_sdk.proto.AvailabilityStatusProto

fun AvailabilityStatus.toProto(): AvailabilityStatusProto {
    return when (this) {
        AvailabilityStatus.INSTALLED -> AvailabilityStatusProto.INSTALLED
        AvailabilityStatus.NOT_INSTALLED -> AvailabilityStatusProto.NOT_INSTALLED
        AvailabilityStatus.NOT_SUPPORTED -> AvailabilityStatusProto.NOT_SUPPORTED
    }
}
