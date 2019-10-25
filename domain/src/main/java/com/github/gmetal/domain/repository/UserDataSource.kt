package com.github.gmetal.domain.repository

import com.github.gmetal.domain.model.Account
import com.github.gmetal.domain.model.ServerSession
import com.github.gmetal.domain.model.Token
import com.github.gmetal.lib.Notifiable

interface UserDataSource {

    fun getAccountDetails(sessionId: String, notifiable: Notifiable<Account, Throwable>)

    fun getNewRequestToken(notifiable: Notifiable<Token, Throwable>)

    fun getNewSession(requestToken: String, notifiable: Notifiable<ServerSession, Throwable>)
}

