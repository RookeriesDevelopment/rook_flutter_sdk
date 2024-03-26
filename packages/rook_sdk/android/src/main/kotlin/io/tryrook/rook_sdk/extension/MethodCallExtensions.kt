package io.tryrook.rook_sdk.extension

import io.flutter.plugin.common.MethodCall

fun MethodCall.getIntArgAt(index: Int): Int {
    return ((arguments as ArrayList<*>)[index] as Int)
}
