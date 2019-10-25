package com.github.gmetal.data.repository.datasource

import com.github.gmetal.data.entity.AccountEntity
import com.github.gmetal.data.entity.RequestTokenEntity
import com.github.gmetal.data.entity.SessionEntity
import com.github.gmetal.data.entity.mapper.Mappers.convert
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.BaseResponseCallback
import com.github.gmetal.domain.model.Account
import com.github.gmetal.domain.model.ServerSession
import com.github.gmetal.domain.model.Token
import com.github.gmetal.domain.repository.UserDataSource
import com.github.gmetal.lib.Notifiable

class RemoteUserDataSource(private val movieDbService: TheMovieDBService, private val apiKey: String) : UserDataSource {

    override fun getAccountDetails(sessionId: String, notifiable: Notifiable<Account, Throwable>) {

        movieDbService.getAccountDetails(apiKey, sessionId)
                .enqueue(BaseResponseCallback<Account, AccountEntity>(notifiable) { r -> convert(r.body()!!) })
    }

    override fun getNewRequestToken(notifiable: Notifiable<Token, Throwable>) {

        movieDbService.getNewRequestToken(apiKey)
                .enqueue(BaseResponseCallback<Token, RequestTokenEntity>(notifiable) { r -> convert(r.body()!!) })
    }

    override fun getNewSession(requestToken: String, notifiable: Notifiable<ServerSession, Throwable>) {

        movieDbService.getNewSession(apiKey, requestToken)
                .enqueue(BaseResponseCallback<ServerSession, SessionEntity>(notifiable) { r -> convert(r.body()!!) })
    }
}
