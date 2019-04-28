package com.github.gmetal.lib;

@FunctionalInterface
public interface SuccessCallback<T> {
    void success(final T successObject);
}
