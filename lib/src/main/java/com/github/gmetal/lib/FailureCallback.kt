package com.github.gmetal.lib

@FunctionalInterface
interface FailureCallback<T> {
    fun failure(failureObject: T)
}
