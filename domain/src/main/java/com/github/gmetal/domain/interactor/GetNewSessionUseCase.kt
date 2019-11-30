package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.ServerSession
import com.github.gmetal.domain.repository.UserDataSource
import com.github.gmetal.lib.Notifiable

class GetNewSessionUseCase(private val userDataSource: UserDataSource) : UseCase<GetNewSessionUseCase.Params, ServerSession, Throwable>() {

    class Params private constructor(val token: String) {
        companion object {
            fun forToken(token: String): Params = Params(token)
        }
    }

    override fun buildUseCase(params: Params, notifiable: Notifiable<ServerSession, Throwable>) {
        userDataSource.getNewSession(params.token, notifiable)
    }
}