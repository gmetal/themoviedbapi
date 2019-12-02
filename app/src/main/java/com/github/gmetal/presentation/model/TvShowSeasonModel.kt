package com.github.gmetal.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TvShowSeasonModel(
    var id: Int = 0,
    var airDate: String = "",
    var episodeCount: Int? = null,
    var seasonNumber: Int? = null,
    var posterPath: String = ""
) : Parcelable
