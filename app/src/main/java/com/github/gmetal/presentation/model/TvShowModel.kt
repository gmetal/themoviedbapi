package com.github.gmetal.presentation.model

import org.parceler.Parcel

import java.util.ArrayList

@Parcel
class TvShowModel : MediaInfoModel() {

    var seasons: List<TvShowSeasonModel>

    override val mediaId: String
        get() = id

    override val image: String
        get() = imageURL

    override val title: String
        get() = name

    init {
        seasons = ArrayList()
    }
}
