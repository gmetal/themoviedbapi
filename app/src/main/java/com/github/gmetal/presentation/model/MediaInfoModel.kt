package com.github.gmetal.presentation.model

import com.github.gmetal.domain.model.MediaItem

interface MediaInfoModel : LoadingModel, MediaItem {

    var overview: String
    var voteCount: Int
    var voteAverage: Float
    var id: String
    var name: String
    var imageURL: String
}
