package com.github.gmetal.domain.model

class PagedEntity<O>(val dataList: List<O>, val position: Int, val totalCount: Int,
                     val previousPageKey: Int?, val nextPageKey: Int?)
