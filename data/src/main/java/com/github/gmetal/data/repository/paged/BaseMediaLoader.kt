package com.github.gmetal.data.repository.paged

import com.github.gmetal.data.entity.response.BasePagedResponseEntity
import com.github.gmetal.data.net.TheMovieDBService
import com.github.gmetal.data.repository.callback.MediaListCallback
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable
import retrofit2.Call

abstract class BaseMediaLoader<R : BasePagedResponseEntity, O, V>(
        var mediaListCallbackRetriever: (Notifiable<PagedEntity<V>, Throwable>) -> MediaListCallback<R, O, V>,
        val apiCallRetriever: (TheMovieDBService, String, Int) -> Call<R>,
        val api: TheMovieDBService,
        val apiKey: String
) {

    fun loadData(page: Int, notifiable: Notifiable<PagedEntity<V>, Throwable>) {

        val apiCall = apiCallRetriever(api, apiKey, page)
        val mediaListCallback = mediaListCallbackRetriever(notifiable)

        apiCall.enqueue(mediaListCallback)
    }
}
