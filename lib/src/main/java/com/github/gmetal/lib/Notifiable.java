package com.github.gmetal.lib;

/**
 * Class to wrap around the generic notion of a Success and a failure callback
 */
public class Notifiable<S, F> implements SuccessCallback<S>, FailureCallback<F> {

    private final SuccessCallback<S> mSuccessCallback;
    private final FailureCallback<F> mFailureCallback;

    public Notifiable(final SuccessCallback<S> successCallback, final FailureCallback<F> failureCallback) {

        mSuccessCallback = successCallback;
        mFailureCallback = failureCallback;
    }

    @Override
    public void failure(final F failureObject) {
        mFailureCallback.failure(failureObject);
    }

    @Override
    public void success(final S successObject) {

        mSuccessCallback.success(successObject);
    }
}
