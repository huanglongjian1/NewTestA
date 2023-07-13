package com.android.newtest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagingState;
import androidx.paging.rxjava3.RxPagingSource;

import com.android.newtest.bean.RxPaging_Bean;

import io.reactivex.rxjava3.core.Single;

public class Paging3DataSource extends RxPagingSource<Integer, RxPaging_Bean> {

    @Nullable
    @Override
    public Integer getRefreshKey(@NonNull PagingState<Integer, RxPaging_Bean> pagingState) {
        return null;
    }

    @NonNull
    @Override
    public Single<LoadResult<Integer, RxPaging_Bean>> loadSingle(@NonNull LoadParams<Integer> loadParams) {
        return null;
    }
}
