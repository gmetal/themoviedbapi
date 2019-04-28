package com.github.gmetal.data.repository.callback;

import androidx.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseResponseCallback<T, R> implements Callback<R> {

    private final SuccessCallback<T> mSuccessCallback;
    private final FailureCallback mFailureCallback;
    private final ResponseConverter<T, R> mResponseConverter;

    public BaseResponseCallback(final SuccessCallback<T> successCallback,
                                final FailureCallback failureCallback,
                                final ResponseConverter<T, R> responseConverter) {

        mSuccessCallback = successCallback;
        mFailureCallback = failureCallback;
        mResponseConverter = responseConverter;
    }

    @Override
    public void onResponse(@NonNull final Call<R> call, @NonNull final Response<R> response) {

        if (response.isSuccessful()) {
            mSuccessCallback.onSuccess(mResponseConverter.convertFrom(response));
        } else {
            mFailureCallback.onFailure(new RuntimeException("Error - Response not successful"));
        }
    }

    @Override
    public void onFailure(@NonNull final Call<R> call, @NonNull final Throwable t) {

        mFailureCallback.onFailure(t);
    }

    public interface ResponseConverter<T, R> {

        T convertFrom(@NonNull final Response<R> response);
    }
}
