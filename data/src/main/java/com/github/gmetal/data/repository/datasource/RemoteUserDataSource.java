package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.domain.model.Account;
import com.github.gmetal.domain.model.ServerSession;
import com.github.gmetal.domain.model.Token;
import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.SuccessCallback;
import com.github.gmetal.domain.repository.UserDataSource;

import static com.github.gmetal.data.entity.mapper.Mappers.convert;

public class RemoteUserDataSource implements UserDataSource {

    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteUserDataSource(final TheMovieDBService theMovieDbService, final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
    }

    @Override
    public void getAccountDetails(final String sessionId,
                                  final AccountDetailsSuccessCallback successCallback,
                                  final FailureCallback failureCallback) {

        mMovieDbService.getAccountDetails(mApiKey, sessionId)
                .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                        r -> convert(r.body())));
    }

    @Override
    public void getNewRequestToken(TokenSuccessCallback successCallback,
                                   FailureCallback failureCallback) {

        mMovieDbService.getNewRequestToken(mApiKey)
                .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                        r -> convert(r.body())));
    }

    @Override
    public void getNewSession(String requestToken, ServerSessionSuccessCallback successCallback,
                              FailureCallback failureCallback) {

        mMovieDbService.getNewSession(mApiKey, requestToken)
                .enqueue(new BaseResponseCallback<>(successCallback, failureCallback,
                        r -> convert(r.body())));
    }
}