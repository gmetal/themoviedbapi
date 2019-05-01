package com.github.gmetal.domain.repository;

import com.github.gmetal.domain.model.Account;
import com.github.gmetal.domain.model.ServerSession;
import com.github.gmetal.domain.model.Token;
import com.github.gmetal.lib.Notifiable;

public interface UserDataSource {

    void getAccountDetails(final String sessionId, final Notifiable<Account, Throwable> notifiable);

    void getNewRequestToken(final Notifiable<Token, Throwable> notifiable);

    void getNewSession(final String requestToken, final Notifiable<ServerSession, Throwable> notifiable);
}

