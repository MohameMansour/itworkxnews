package com.example.itworkxnews.data.remote.data_source


import com.example.itworkxnews.core.constants.DEFAULT_COUNTRY
import com.example.itworkxnews.core.constants.DEFAULT_PAGE_NUMBER
import com.example.itworkxnews.data.models.news.NewsAPIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getNewsHeadlines(
        country: String = DEFAULT_COUNTRY,
        pageNumber: Int = DEFAULT_PAGE_NUMBER
    ) : Response<NewsAPIResponse>


    suspend fun searchNews(
        searchQuery: String,
    ) : Response<NewsAPIResponse>

}