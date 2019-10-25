package com.github.gmetal.data.repository.callback

import com.github.gmetal.data.entity.response.BasePagedResponseEntity
import com.github.gmetal.domain.model.PagedEntity
import com.github.gmetal.lib.Notifiable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

open class MediaListCallback<PagedResponse : BasePagedResponseEntity, DataObject, DomainObject>(
        private val notifiable: Notifiable<PagedEntity<DomainObject>, Throwable>,
        private val dataObjectExtractor: (PagedResponse) -> List<DataObject>,
        private val objectToMediaInfo: (DataObject) -> DomainObject
) : Callback<PagedResponse> {

    override fun onResponse(call: Call<PagedResponse>, response: Response<PagedResponse>) {

        if (response.isSuccessful) {
            val mediaInfos = ArrayList<DomainObject>()
            val responseBody = response.body()

            if (responseBody != null) {
                val results = dataObjectExtractor(responseBody)

                for (result in results) {
                    mediaInfos.add(objectToMediaInfo(result))
                }

                notifiable.success(PagedEntity(mediaInfos, 0, responseBody.totalResults,
                        if (responseBody.page == 1) null else responseBody.page - 1,
                        responseBody.page + 1))

            } else {
                notifiable.failure(RuntimeException("No Data!"))
            }
        } else {
            notifiable.failure(RuntimeException("Error!"))
        }
    }

    override fun onFailure(call: Call<PagedResponse>, t: Throwable) {

        notifiable.failure(t)
    }
}