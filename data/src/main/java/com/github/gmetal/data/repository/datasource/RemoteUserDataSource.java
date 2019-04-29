package com.github.gmetal.data.repository.datasource;

import com.github.gmetal.data.net.TheMovieDBService;
import com.github.gmetal.data.repository.callback.BaseResponseCallback;
import com.github.gmetal.domain.model.Account;
import com.github.gmetal.domain.model.ServerSession;
import com.github.gmetal.domain.model.Token;
import com.github.gmetal.lib.Notifiable;

import static com.github.gmetal.data.entity.mapper.Mappers.convert;

public class RemoteUserDataSource implements UserDataSource {

    private final TheMovieDBService mMovieDbService;
    private final String mApiKey;

    public RemoteUserDataSource(final TheMovieDBService theMovieDbService, final String apiKey) {

        mMovieDbService = theMovieDbService;
        mApiKey = apiKey;
    }

    @Override
    public void getAccountDetails(final String sessionId, final Notifiable<Account, Throwable> notifiable) {

        mMovieDbService.getAccountDetails(mApiKey, sessionId)
                .enqueue(new BaseResponseCallback<>(notifiable, r -> convert(r.body())));
    }

    @Override
    public void getNewRequestToken(final Notifiable<Token, Throwable> notifiable) {

        mMovieDbService.getNewRequestToken(mApiKey)
                .enqueue(new BaseResponseCallback<>(notifiable, r -> convert(r.body())));
    }

    @Override
    public void getNewSession(final String requestToken, final Notifiable<ServerSession, Throwable> notifiable) {

        mMovieDbService.getNewSession(mApiKey, requestToken)
                .enqueue(new BaseResponseCallback<>(notifiable, r -> convert(r.body())));
    }
}
