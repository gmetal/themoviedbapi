package com.github.gmetal.domain.interactor

import com.github.gmetal.domain.model.Token
import com.github.gmetal.domain.repository.UserDataSource
import com.github.gmetal.lib.Notifiable

class GetNewUserTokenUseCase(private val userDataSource: UserDataSource) : UseCase<Unit, Token, Throwable>() {

    override fun buildUseCase(params: Unit, notifiable: Notifiable<Token, Throwable>) {
        userDataSource.getNewRequestToken(notifiable)
    }
}