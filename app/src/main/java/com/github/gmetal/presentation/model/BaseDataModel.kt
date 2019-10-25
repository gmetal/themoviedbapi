package com.github.gmetal.presentation.model

import org.parceler.Parcel

@Parcel
open class BaseDataModel @JvmOverloads constructor(override var isLoadingObject: Boolean = false) : LoadingModel
