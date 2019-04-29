package com.github.gmetal.data.repository.callback;

import androidx.annotation.NonNull;

import com.github.gmetal.lib.Notifiable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseResponseCallback<T, R> implements Callback<R> {

    private final ResponseConverter<T, R> mResponseConverter;
    private Notifiable<T, Throwable> mNotifiable;

    public BaseResponseCallback(@NonNull final Notifiable<T, Throwable> notifiable,
                                @NonNull final ResponseConverter<T, R> responseConverter) {
        mNotifiable = notifiable;
        mResponseConverter = responseConverter;
    }

    @Override
    public void onResponse(@NonNull final Call<R> call, @NonNull final Response<R> response) {

        if (response.isSuccessful()) {
            mNotifiable.success(mResponseConverter.convertFrom(response));
        } else {
            mNotifiable.failure(new RuntimeException("Error - Response not successful"));
        }
    }

    @Override
    public void onFailure(@NonNull final Call<R> call, @NonNull final Throwable t) {

        mNotifiable.failure(t);
    }

    public interface ResponseConverter<T, R> {

        T convertFrom(@NonNull final Response<R> response);
    }
}
