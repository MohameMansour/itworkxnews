package com.example.itworkxnews.data.remote.data_source

import com.example.itworkxnews.data.models.news.NewsAPIResponse
import com.example.itworkxnews.data.remote.api.NewsAPIService
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
) : NewsRemoteDataSource {

    override suspend fun getNewsHeadlines(
        country: String,
        pageNumber: Int
    ): Response<NewsAPIResponse> {
        return newsAPIService.getNewsHeadlines(country, pageNumber)
    }

    override suspend fun searchNews(searchQuery: String): Response<NewsAPIResponse> {
        return newsAPIService.getSearchNews(searchQuery)
    }


}