package com.github.gmetal.data.repository.callback;

import androidx.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BasePagedRetrofitCallback<T, O> implements Callback<T> {

    protected final PagedListSuccessCallback<O> mSuccessCallback;
    protected final FailureCallback mFailureCallback;

    public BasePagedRetrofitCallback(final PagedListSuccessCallback<O> successCallback,
                                     final FailureCallback failureCallback) {

        mSuccessCallback = successCallback;
        mFailureCallback = failureCallback;
    }

    @Override
    public void onResponse(@NonNull final Call<T> call, @NonNull final Response<T> response) {

    }

    @Override
    public void onFailure(@NonNull final Call<T> call, @NonNull final Throwable t) {

    }
}
