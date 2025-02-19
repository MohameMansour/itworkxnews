package com.example.itworkxnews.data.local.data_source

import com.example.itworkxnews.data.models.news.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource{

    suspend fun saveNewFromBookmarks(article: Article)

    fun getSavedNews(): Flow<List<Article>>

    suspend fun deleteNewFromBookmarks(article: Article) : Boolean

    fun isBookmarked(articleUrl: String): Boolean

}