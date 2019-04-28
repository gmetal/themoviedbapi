package com.github.gmetal.data.repository.callback;

@FunctionalInterface
public interface FailureCallback {

    void onFailure(final Throwable throwable);
}
