package com.github.gmetal.data.repository.callback

@FunctionalInterface
interface FailureCallback {

    fun onFailure(throwable: Throwable)
}
