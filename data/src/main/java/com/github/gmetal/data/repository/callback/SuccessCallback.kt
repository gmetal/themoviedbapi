package com.github.gmetal.data.repository.callback

@FunctionalInterface
interface SuccessCallback<T> {

    fun onSuccess(response: T)
}
