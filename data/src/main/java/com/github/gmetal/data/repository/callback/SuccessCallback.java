package com.github.gmetal.data.repository.callback;

@FunctionalInterface
public interface SuccessCallback<T> {

    void onSuccess(final T response);
}
