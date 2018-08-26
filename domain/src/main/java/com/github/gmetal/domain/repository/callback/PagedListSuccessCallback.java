package com.github.gmetal.domain.repository.callback;

import android.support.annotation.Nullable;

import java.util.List;

@FunctionalInterface
public interface PagedListSuccessCallback<O> {

    void onSuccess(final List<O> dataList, int position, int totalCount,
                   @Nullable Integer previousPageKey, @Nullable final Integer nextPageKey);
}

