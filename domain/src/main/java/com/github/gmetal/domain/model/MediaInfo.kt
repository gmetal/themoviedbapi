package com.github.gmetal.domain.model

data class MediaInfo(
        var name: String = "",
        var isTv: Boolean = false,
        var dbId: String = "",

        var imageURL: String = "",
        var overview: String = "",
        var voteCount: Int? = null,
        var voteAverage: Float? = null
) {
    val mediaId: String
        get() = this.dbId

    val image: String
        get() = imageURL

    val title: String
        get() = name
}
