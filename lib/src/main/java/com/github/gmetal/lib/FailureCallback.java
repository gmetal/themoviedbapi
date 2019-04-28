package com.github.gmetal.lib;

@FunctionalInterface
public interface FailureCallback<T> {
    void failure(final T failureObject);
}
