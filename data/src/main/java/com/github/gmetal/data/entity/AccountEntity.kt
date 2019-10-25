package com.github.gmetal.data.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject

@JsonObject
class AccountEntity : BaseMoviesDbEntity() {

    @JsonField(name = ["avatar"])
    var avatar: GravatarEntity? = null

    @JsonField(name = ["id"])
    var id: Int? = null

    @JsonField(name = ["iso_639_1"])
    var iso6391: String? = null

    @JsonField(name = ["iso_3166_1"])
    var iso31661: String? = null

    @JsonField(name = ["name"])
    var name: String? = null

    @JsonField(name = ["include_adult"])
    var includeAdult: Boolean = false

    @JsonField(name = ["username"])
    var username: String? = null
}
