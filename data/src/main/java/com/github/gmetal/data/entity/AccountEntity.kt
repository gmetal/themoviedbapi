package com.github.gmetal.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AccountEntity : BaseMoviesDbEntity() {

    @SerialName("avatar")
    var avatar: GravatarEntity? = null

    @SerialName("id")
    var id: Int? = null

    @SerialName("iso_639_1")
    var iso6391: String? = null

    @SerialName("iso_3166_1")
    var iso31661: String? = null

    @SerialName("name")
    var name: String? = null

    @SerialName("include_adult")
    var includeAdult: Boolean = false

    @SerialName("username")
    var username: String? = null
}
