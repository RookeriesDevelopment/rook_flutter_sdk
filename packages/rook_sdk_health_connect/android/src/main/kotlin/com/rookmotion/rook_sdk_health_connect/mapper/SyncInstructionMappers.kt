package com.rookmotion.rook_sdk_health_connect.mapper

import com.rookmotion.rook.sdk.domain.enums.SyncInstruction
import com.rookmotion.rook_sdk_health_connect.proto.SyncInstructionProto

fun SyncInstructionProto.toSyncInstruction(): SyncInstruction {
    return when (this) {
        SyncInstructionProto.NOTHING -> SyncInstruction.NOTHING
        SyncInstructionProto.SYNC_OLDEST -> SyncInstruction.SYNC_OLDEST
        else -> SyncInstruction.SYNC_LATEST
    }
}
