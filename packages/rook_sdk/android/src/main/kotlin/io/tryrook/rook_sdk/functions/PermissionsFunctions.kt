package io.tryrook.rook_sdk.functions

const val CHECK_AVAILABILITY: String = "checkAvailability"
const val OPEN_HEALTH_CONNECT_SETTINGS: String = "openHealthConnectSettings"
const val CHECK_PERMISSIONS: String = "checkPermissions"
const val REQUEST_PERMISSIONS: String = "requestPermissions"

val permissionsFunctions: Set<String> = setOf(
    CHECK_AVAILABILITY,
    OPEN_HEALTH_CONNECT_SETTINGS,
    CHECK_PERMISSIONS,
    REQUEST_PERMISSIONS,
)
