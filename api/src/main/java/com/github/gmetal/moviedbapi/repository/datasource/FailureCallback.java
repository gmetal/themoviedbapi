package com.github.gmetal.moviedbapi.repository.datasource;

@FunctionalInterface
public interface FailureCallback {

    void onFailure(final Throwable throwable);
}
