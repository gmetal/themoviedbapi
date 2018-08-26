package com.github.gmetal.moviedbapi.repository.datasource;

import com.github.gmetal.moviedbapi.repository.TheMovieDBService;
import com.github.gmetal.moviedbapi.repository.model.Account;
import com.github.gmetal.moviedbapi.repository.model.ServerSession;
import com.github.gmetal.moviedbapi.repository.model.Token;

public class RemoteUserDataSource implements UserDataSource {

    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteUserDataSource(final TheMovieDBService theMovieDbService, final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
    }

    @Override
    public void getAccountDetails(final String sessionId,
                                  final SuccessCallback<Account> successCallback,
                                  final FailureCallback failureCallback) {

        mMovieDbService.getAccountDetails(mApiKey, sessionId)
                       .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                                                           r -> new Account(r.body())));
    }

    @Override
    public void getNewRequestToken(SuccessCallback<Token> successCallback,
                                   FailureCallback failureCallback) {

        mMovieDbService.getNewRequestToken(mApiKey)
                       .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                                                           r -> new Token(r.body())));
    }

    @Override
    public void getNewSession(String requestToken, SuccessCallback<ServerSession> successCallback,
                              FailureCallback failureCallback) {

        mMovieDbService.getNewSession(mApiKey, requestToken)
                       .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                                                           r -> new ServerSession(r.body())));
    }
}
