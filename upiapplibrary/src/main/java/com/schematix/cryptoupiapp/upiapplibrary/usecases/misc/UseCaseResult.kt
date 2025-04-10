package com.schematix.cryptoupiapp.upiapplibrary.usecases.misc

sealed class UseCaseResult<out T> {
    data object Initial : UseCaseResult<Nothing>()

    data object Loading : UseCaseResult<Nothing>()
    data class Success<out T>(val data: T) : UseCaseResult<T>()
    data class Error(val exception: Throwable) : UseCaseResult<Nothing>()
}

fun <T> UseCaseResult<T>.isSuccess(): Boolean {
    return this is UseCaseResult.Success
}

fun <T> UseCaseResult<T>.isError(): Boolean {
    return this is UseCaseResult.Error
}

inline fun <T> UseCaseResult<T>.onSuccess(action: (T) -> Unit): UseCaseResult<T> {
    if (this is UseCaseResult.Success) {
        action(data)
    }
    return this
}

inline fun <T> UseCaseResult<T>.onError(action: (Throwable) -> Unit): UseCaseResult<T> {
    if (this is UseCaseResult.Error) {
        action(exception)
    }
    return this
}