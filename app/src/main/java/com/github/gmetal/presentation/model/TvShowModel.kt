package com.github.gmetal.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TvShowModel(
    override var overview: String = "",
    override var voteCount: Int = 0,
    override var voteAverage: Float = 0.0f,
    override var id: String = "",
    override var name: String = "",
    override var imageURL: String = "",
    override var isLoadingObject: Boolean = false,
    var seasons: List<TvShowSeasonModel> = emptyList()
) : MediaInfoModel, Parcelable {

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
