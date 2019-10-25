package com.github.gmetal.lib

/**
 * Class to wrap around the generic notion of a Success and a failure callback
 */
class Notifiable<S, F>(private val successCallback: SuccessCallback<S>, private val failureCallback: FailureCallback<F>) : SuccessCallback<S>, FailureCallback<F> {

    override fun failure(failureObject: F) {
        failureCallback.failure(failureObject)
    }

    override fun success(successObject: S) {

        successCallback.success(successObject)
    }
}
