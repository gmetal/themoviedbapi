package com.github.gmetal.domain.model

class Token {

    var isSuccess: Boolean = false
    var expiresAt: String

    var requestToken: String

    init {

        isSuccess = false
        expiresAt = ""
        requestToken = ""
    }
}
