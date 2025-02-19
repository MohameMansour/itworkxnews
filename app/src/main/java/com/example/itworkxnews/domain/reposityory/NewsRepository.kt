package com.example.itworkxnews.domain.reposityory


import com.example.itworkxnews.core.constants.DEFAULT_COUNTRY
import com.example.itworkxnews.core.constants.DEFAULT_PAGE_NUMBER
import com.example.itworkxnews.data.models.news.Article
import com.example.itworkxnews.data.models.news.NewsAPIResponse
import com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource
import com.example.itworkxnews.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(
        country: String = DEFAULT_COUNTRY,
        page: Int = DEFAULT_PAGE_NUMBER
    ): Resource<NewsAPIResponse>

    fun getNewsPagingSource(): NewsRemotePagingSource

    suspend fun searchNews(searchQuery: String): Resource<NewsAPIResponse>

    suspend fun saveNewFromBookmarks(article: Article)

    suspend fun deleteNewFromBookmarks(article: Article) : Boolean

    fun getSavedNews(): Flow<List<Article>>

    fun getLastSearchQueries(): List<String>

    fun setLastSearchQuery(query: String) : Boolean

    fun deleteLastSearchQuery(query: String) : Boolean

    fun isBookmarked(articleUrl: String): Boolean

}