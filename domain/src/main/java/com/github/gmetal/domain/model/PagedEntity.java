package com.github.gmetal.domain.model;

import java.util.List;

public class PagedEntity<O> {

    private final List<O> mDataList;
    private final int mPosition;
    private final int mTotalCount;
    private final Integer mPreviousPageKey;
    private final Integer mNextPageKey;

    public PagedEntity(final List<O> dataList, int position, int totalCount,
                       Integer previousPageKey, final Integer nextPageKey) {
        mDataList = dataList;
        mPosition = position;
        mTotalCount = totalCount;
        mPreviousPageKey = previousPageKey;
        mNextPageKey = nextPageKey;
    }

    public List<O> getDataList() {
        return mDataList;
    }

    public int getPosition() {
        return mPosition;
    }

    public int getTotalCount() {
        return mTotalCount;
    }

    public Integer getPreviousPageKey() {
        return mPreviousPageKey;
    }

    public Integer getNextPageKey() {
        return mNextPageKey;
    }
}
