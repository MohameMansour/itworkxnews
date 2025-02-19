package com.example.itworkxnews.data.local.data_source

import com.example.itworkxnews.data.db.ArticleDAO
import com.example.itworkxnews.data.models.news.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource{

    override suspend fun saveNewFromBookmarks(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedNews(): Flow<List<Article>> {
        return articleDAO.getAllSavedNews().map {
            it.reversed()
        }
    }

    override suspend fun deleteNewFromBookmarks(article: Article) : Boolean{
        val affected = if (article.id != null) {
            articleDAO.deleteWithId(article.id)
        } else {
            article.url?.let { articleDAO.deleteWithUrl(it) }
        }
        return affected != null
    }

    override fun isBookmarked(articleUrl: String): Boolean {
        return articleDAO.isBookmarked(articleUrl)
    }

}