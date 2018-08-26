package com.github.gmetal.domain.repository.callback;

@FunctionalInterface
public interface SuccessCallback<T> {

    void onSuccess(final T response);
}
