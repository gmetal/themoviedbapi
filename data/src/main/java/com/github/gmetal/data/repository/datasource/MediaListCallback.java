package com.github.gmetal.data.repository.datasource;

import android.support.annotation.NonNull;

import com.github.gmetal.data.net.response.BasePagedResponseEntity;
import com.github.gmetal.domain.model.MediaInfo;
import com.github.gmetal.domain.repository.callback.FailureCallback;
import com.github.gmetal.domain.repository.callback.PagedListSuccessCallback;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class MediaListCallback<T extends BasePagedResponseEntity<O>, O>
        extends BasePagedRetrofitCallback<T, MediaInfo> {

    private final ObjectToMediaInfo<O> mObjectToMediaInfo;

    public MediaListCallback(final PagedListSuccessCallback<MediaInfo> successCallback,
                             final FailureCallback failureCallback,
                             final ObjectToMediaInfo<O> objectToMediaInfo) {

        super(successCallback, failureCallback);
        mObjectToMediaInfo = objectToMediaInfo;
    }

    @Override
    public void onResponse(@NonNull Call<T> call, @NonNull Response<T> response) {

        super.onResponse(call, response);
        if (response.isSuccessful()) {
            List<MediaInfo> mediaInfos = new ArrayList<>();
            T responseBody = response.body();

            if (responseBody != null) {
                List<O> results = responseBody.getResultObjects();

                for (int i = 0; i < results.size(); i++) {
                    mediaInfos.add(mObjectToMediaInfo.parse(results.get(i)));
                }

                mSuccessCallback.onSuccess(mediaInfos, 0, responseBody.mTotalResults,
                        responseBody.mPage == 1 ? null : responseBody.mPage - 1,
                        responseBody.mPage + 1);
            } else {
                mFailureCallback.onFailure(new RuntimeException("No Data!"));
            }
        } else {
            mFailureCallback.onFailure(new RuntimeException("Error!"));
        }
    }

    @Override
    public void onFailure(@NonNull Call<T> call, @NonNull Throwable t) {

        super.onFailure(call, t);
        mFailureCallback.onFailure(t);
    }

    @FunctionalInterface
    public interface ObjectToMediaInfo<O> {

        MediaInfo parse(O obj);
    }
}