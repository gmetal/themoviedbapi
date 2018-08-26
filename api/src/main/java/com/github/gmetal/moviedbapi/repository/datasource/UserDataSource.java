package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.model.Account;
import com.github.gmetal.moviedbapi.repository.model.ServerSession;
import com.github.gmetal.moviedbapi.repository.model.Token;

public interface UserDataSource {

    void getAccountDetails(final String sessionId, final SuccessCallback<Account> successCallback,
                           final FailureCallback failureCallback);

    void getNewRequestToken(final SuccessCallback<Token> successCallback,
                            final FailureCallback failureCallback);

    void getNewSession(final String requestToken, final SuccessCallback<ServerSession> successCallback,
                       final FailureCallback failureCallback);
}

