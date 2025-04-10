package com.schematix.cryptoupiapp.upiapplibrary.usecases.misc

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.shareIn

abstract class UseCase<in P, R>(
    private val scope: CoroutineScope = MainScope()
) {
    protected abstract suspend fun execute(params: P): Flow<UseCaseResult<R>>

    operator fun invoke(params: P): Flow<UseCaseResult<R>> = flow {
        emit(UseCaseResult.Loading)
        try {
            emitAll(execute(params))
        } catch (e: Exception) {
            emit(UseCaseResult.Error(e))
        }
    }.flowOn(Dispatchers.IO).shareIn(
        scope = scope,
        started = SharingStarted.Lazily,
        replay = 1
    )


}