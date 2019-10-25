package com.github.gmetal.domain.interactor

import com.github.gmetal.lib.Notifiable

abstract class UseCase<Params, SuccessDomainObject, FailureObject> {

    abstract fun buildUseCase(params: Params, notifiable: Notifiable<SuccessDomainObject, FailureObject>)
}
