package com.github.gmetal.domain.interactor;

import com.github.gmetal.lib.Notifiable;

public abstract class UseCase<Params, SuccessDomainObject, FailureObject> {

    public abstract void buildUseCase(final Params params, final Notifiable<SuccessDomainObject, FailureObject> notifiable);
}
