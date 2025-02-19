package com.example.itworkxnews.data.remote.data_source.paging_source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.itworkxnews.core.constants.PAGING_STARTING_PAGE_INDEX
import com.example.itworkxnews.data.models.news.Article
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource
import javax.inject.Inject

class NewsRemotePagingSource @Inject constructor(
    private val newsRemoteDataSource: NewsRemoteDataSource,
) : PagingSource<Int, Article>(){


    override fun getRefreshKey(state: PagingState<Int, Article>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Article> {
        val start: Int = params.key ?: PAGING_STARTING_PAGE_INDEX
        return try {
            val response = newsRemoteDataSource.getNewsHeadlines(
                pageNumber = start,
            )
            val articles = response.body()?.articles ?: emptyList()
            LoadResult.Page(
                data = articles,
                prevKey = if (start == PAGING_STARTING_PAGE_INDEX) null else start - 1,
                nextKey = if (articles.isEmpty()) null else start + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}