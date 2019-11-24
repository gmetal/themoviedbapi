package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.Account
import com.github.gmetal.domain.repository.UserDataSource
import com.github.gmetal.lib.Notifiable

class GetAccountDetailsUseCase(private val userDataSource: UserDataSource) : UseCase<GetAccountDetailsUseCase.Params, Account, Throwable>() {

    override fun buildUseCase(params: Params, notifiable: Notifiable<Account, Throwable>) {

        userDataSource.getAccountDetails(params.sessionId, notifiable)
    }

    class Params(val sessionId: String) {
        companion object {
            fun forUser(sessionId: String): Params = Params(sessionId)
        }
    }
}