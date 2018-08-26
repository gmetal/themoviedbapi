package com.github.gmetal.moviedbapi.repository.datasource;

import android.support.annotation.Nullable;
import com.github.gmetal.moviedbapi.repository.model.LoadingObject;
import java.util.List;

@FunctionalInterface
public interface PagedListSuccessCallback<O extends LoadingObject> {

    void onSuccess(final List<O> dataList, int position, int totalCount,
                   @Nullable Integer previousPageKey, @Nullable final Integer nextPageKey);
}

