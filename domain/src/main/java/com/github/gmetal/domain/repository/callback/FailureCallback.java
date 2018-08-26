package com.github.gmetal.domain.repository.callback;

@FunctionalInterface
public interface FailureCallback {

    void onFailure(final Throwable throwable);
}
