package com.github.gmetal.lib

@FunctionalInterface
interface SuccessCallback<T> {
    fun success(successObject: T)
}
