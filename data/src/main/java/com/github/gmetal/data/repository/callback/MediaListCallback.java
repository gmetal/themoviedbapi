package com.github.gmetal.data.repository.callback;

import androidx.annotation.NonNull;

import com.github.gmetal.domain.model.PagedEntity;
import com.github.gmetal.data.entity.response.BasePagedResponseEntity;
import com.github.gmetal.lib.Notifiable;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MediaListCallback<PagedResponse extends BasePagedResponseEntity<DataObject>, DataObject, DomainObject> implements Callback<PagedResponse> {

    private final ObjectToMediaInfo<DataObject, DomainObject> mObjectToMediaInfo;
    private final Notifiable<PagedEntity<DomainObject>, Throwable> mNotifiable;

    public MediaListCallback(@NonNull final Notifiable<PagedEntity<DomainObject>, Throwable> notifiable,
                             @NonNull final ObjectToMediaInfo<DataObject, DomainObject> objectToMediaInfo) {

        mObjectToMediaInfo = objectToMediaInfo;
        mNotifiable = notifiable;
    }

    @Override
    public void onResponse(@NonNull Call<PagedResponse> call, @NonNull Response<PagedResponse> response) {

        if (response.isSuccessful()) {
            List<DomainObject> mediaInfos = new ArrayList<>();
            PagedResponse responseBody = response.body();

            if (responseBody != null) {
                List<DataObject> results = responseBody.getResultObjects();

                for (int i = 0; i < results.size(); i++) {
                    mediaInfos.add(mObjectToMediaInfo.parse(results.get(i)));
                }

                mNotifiable.success(new PagedEntity<DomainObject>(mediaInfos, 0, responseBody.mTotalResults,
                        responseBody.mPage == 1 ? null : responseBody.mPage - 1,
                        responseBody.mPage + 1));

            } else {
                mNotifiable.failure(new RuntimeException("No Data!"));
            }
        } else {
            mNotifiable.failure(new RuntimeException("Error!"));
        }
    }

    @Override
    public void onFailure(@NonNull Call<PagedResponse> call, @NonNull Throwable t) {

        mNotifiable.failure(t);
    }

    @FunctionalInterface
    public interface ObjectToMediaInfo<O, DomainObject> {

        DomainObject parse(O obj);
    }
}