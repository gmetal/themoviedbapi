package com.github.gmetal.domain.repository;

import com.github.gmetal.domain.model.Account;
import com.github.gmetal.domain.model.ServerSession;
import com.github.gmetal.domain.model.Token;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.SuccessCallback;

public interface UserDataSource {

    interface AccountDetailsSuccessCallback extends SuccessCallback<Account> {

    }

    interface TokenSuccessCallback extends SuccessCallback<Token> {

    }

    interface ServerSessionSuccessCallback extends SuccessCallback<ServerSession> {

    }

    void getAccountDetails(final String sessionId, final AccountDetailsSuccessCallback successCallback,
                           final FailureCallback failureCallback);

    void getNewRequestToken(final TokenSuccessCallback successCallback,
                            final FailureCallback failureCallback);

    void getNewSession(final String requestToken, final ServerSessionSuccessCallback successCallback,
                       final FailureCallback failureCallback);
}

