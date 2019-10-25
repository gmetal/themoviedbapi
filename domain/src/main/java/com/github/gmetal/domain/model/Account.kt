package com.github.gmetal.domain.model

data class Account(
        var avatarHash: String = "",
        var id: Int = 0,
        var iso6391: String = "",
        var iso31661: String = "",
        var name: String = "",
        var isIncludeAdult: Boolean = false,
        var username: String = ""
)
