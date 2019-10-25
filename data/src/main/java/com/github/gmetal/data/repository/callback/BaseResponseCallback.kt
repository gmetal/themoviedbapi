package com.github.gmetal.data.repository.callback

import com.github.gmetal.lib.Notifiable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BaseResponseCallback<T, R>(private val notifiable: Notifiable<T, Throwable>,
                                 private val responseConverter: (Response<R>) -> T) : Callback<R> {

    override fun onResponse(call: Call<R>, response: Response<R>) {

        if (response.isSuccessful) {
            notifiable.success(responseConverter(response))
        } else {
            notifiable.failure(RuntimeException("Error - Response not successful"))
        }
    }

    override fun onFailure(call: Call<R>, t: Throwable) {

        notifiable.failure(t)
    }
}
