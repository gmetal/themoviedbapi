package com.github.gmetal.domain.model

interface MediaItem {

    val mediaId: String

    val image: String

    val title: String

    companion object {

        val IMAGE_PREFIX = "https://image.tmdb.org/t/p/w500/"
    }
}
