package com.github.gmetal.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MovieModel(
    override var overview: String = "",
    override var voteCount: Int = 0,
    override var voteAverage: Float = 0.0f,
    override var id: String = "",
    override var name: String = "",
    override var imageURL: String = "",
    override var isLoadingObject: Boolean = false
) : MediaInfoModel, Parcelable {

    override val mediaId: String
        get() = this.id

    override val title: String
        get() = name

    override val image: String
        get() = imageURL
}
