package com.github.gmetal.moviedbapi.repository.datasource;

@FunctionalInterface
public interface SuccessCallback<T> {

    void onSuccess(final T response);
}
