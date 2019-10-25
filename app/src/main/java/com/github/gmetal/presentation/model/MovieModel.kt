package com.github.gmetal.presentation.model

import org.parceler.Parcel

@Parcel
class MovieModel : MediaInfoModel() {

    override val mediaId: String
        get() = this.id

    override val title: String
        get() = name

    override val image: String
        get() = imageURL
}
