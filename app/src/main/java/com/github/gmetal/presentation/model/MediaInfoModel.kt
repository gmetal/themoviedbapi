package com.github.gmetal.presentation.model

import com.github.gmetal.domain.model.MediaItem


abstract class MediaInfoModel : BaseDataModel(), MediaItem {

    var overview: String = ""
    var voteCount: Int? = null
    var voteAverage: Float? = null
    var id: String = ""
    var name: String = ""
    var imageURL: String = ""
}
