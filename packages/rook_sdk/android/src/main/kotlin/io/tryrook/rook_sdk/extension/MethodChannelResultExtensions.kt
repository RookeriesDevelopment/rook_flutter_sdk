package io.tryrook.rook_sdk.extension

import com.rookmotion.rook.sdk.domain.exception.DeviceNotSupportedException
import com.rookmotion.rook.sdk.domain.exception.HealthConnectNotInstalledException
import com.rookmotion.rook.sdk.domain.exception.HttpRequestException
import com.rookmotion.rook.sdk.domain.exception.MissingAndroidPermissionsException
import com.rookmotion.rook.sdk.domain.exception.MissingConfigurationException
import com.rookmotion.rook.sdk.domain.exception.MissingPermissionsException
import com.rookmotion.rook.sdk.domain.exception.RequestQuotaExceededException
import com.rookmotion.rook.sdk.domain.exception.SDKNotInitializedException
import com.rookmotion.rook.sdk.domain.exception.TimeoutException
import com.rookmotion.rook.sdk.domain.exception.UserNotInitializedException
import io.tryrook.rook_sdk.mapper.toProto
import io.flutter.plugin.common.MethodChannel
import io.tryrook.rook_sdk.proto.GenericExceptionProto
import io.tryrook.rook_sdk.proto.ResultBooleanProto

fun MethodChannel.Result.intSuccess(int: Int) {
    success(int)
}

fun MethodChannel.Result.throwableError(throwable: Throwable) {
    error(GENERIC_ERROR_CODE, throwable.message, null)
}

fun MethodChannel.Result.resultBooleanSuccess(boolean: Boolean) {
    val result = ResultBooleanProto.newBuilder()
        .setSuccess(boolean)
        .build()

    success(result.toByteArray())
}

fun MethodChannel.Result.resultBooleanError(throwable: Throwable) {
    val bytes = when (throwable) {
        is DeviceNotSupportedException -> {
            val result = ResultBooleanProto.newBuilder()
                .setDeviceNotSupportedExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is HealthConnectNotInstalledException -> {
            val result = ResultBooleanProto.newBuilder()
                .setHealthConnectNotInstalledExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is HttpRequestException -> {
            val result = ResultBooleanProto.newBuilder()
                .setHttpRequestExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is MissingConfigurationException -> {
            val result = ResultBooleanProto.newBuilder()
                .setMissingConfigurationExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is MissingPermissionsException -> {
            val result = ResultBooleanProto.newBuilder()
                .setMissingPermissionsExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is RequestQuotaExceededException -> {
            val result = ResultBooleanProto.newBuilder()
                .setRequestQuotaExceededExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is SDKNotInitializedException -> {
            val result = ResultBooleanProto.newBuilder()
                .setSdkNotInitializedExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is TimeoutException -> {
            val result = ResultBooleanProto.newBuilder()
                .setTimeoutExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is UserNotInitializedException -> {
            val result = ResultBooleanProto.newBuilder()
                .setUserNotInitializedExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        is MissingAndroidPermissionsException -> {
            val result = ResultBooleanProto.newBuilder()
                .setMissingAndroidPermissionsExceptionProto(throwable.toProto())
                .build()

            result.toByteArray()
        }

        else -> {
            val proto = GenericExceptionProto.newBuilder()
                .setMessage(throwable.localizedMessage)

            val result = ResultBooleanProto.newBuilder()
                .setGenericExceptionProto(proto)
                .build()

            result.toByteArray()
        }
    }

    success(bytes)
}

private const val GENERIC_ERROR_CODE = "-1"
