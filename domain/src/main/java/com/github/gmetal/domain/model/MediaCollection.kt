package com.github.gmetal.domain.model

data class MediaCollection(
    val id: Int = DEFAULT_ID,
    val name: String = "",
    val posterPath: String = "",
    val backdropPath: String = ""
) {

    companion object {
        private val EMPTY_OBJECT = MediaCollection()
        fun empty() = EMPTY_OBJECT
    }
}

