package com.example.itworkxnews.domain.reposityory;

import com.example.itworkxnews.data.local.cache.CacheManager;
import com.example.itworkxnews.data.local.data_source.NewsLocalDataSource;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource;
import com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource;
import com.example.itworkxnews.data.utils.Resource;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0016J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\"H\u0002J\u0019\u0010#\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010&\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/itworkxnews/domain/reposityory/NewsRepositoryImpl;", "Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "newsRemoteDataSource", "Lcom/example/itworkxnews/data/remote/data_source/NewsRemoteDataSource;", "newsLocalDataSource", "Lcom/example/itworkxnews/data/local/data_source/NewsLocalDataSource;", "cacheManager", "Lcom/example/itworkxnews/data/local/cache/CacheManager;", "(Lcom/example/itworkxnews/data/remote/data_source/NewsRemoteDataSource;Lcom/example/itworkxnews/data/local/data_source/NewsLocalDataSource;Lcom/example/itworkxnews/data/local/cache/CacheManager;)V", "deleteLastSearchQuery", "", "query", "", "deleteNewFromBookmarks", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSearchQueries", "", "getNewsHeadlines", "Lcom/example/itworkxnews/data/utils/Resource;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "country", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsPagingSource", "Lcom/example/itworkxnews/data/remote/data_source/paging_source/NewsRemotePagingSource;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "isBookmarked", "articleUrl", "responseToResource", "response", "Lretrofit2/Response;", "saveNewFromBookmarks", "", "searchNews", "searchQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastSearchQuery", "app_debug"})
public final class NewsRepositoryImpl implements com.example.itworkxnews.domain.reposityory.NewsRepository {
    private final com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource newsRemoteDataSource = null;
    private final com.example.itworkxnews.data.local.data_source.NewsLocalDataSource newsLocalDataSource = null;
    private final com.example.itworkxnews.data.local.cache.CacheManager cacheManager = null;
    
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource newsRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.local.data_source.NewsLocalDataSource newsLocalDataSource, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.local.cache.CacheManager cacheManager) {
        super();
    }
    
    private final com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse> responseToResource(retrofit2.Response<com.example.itworkxnews.data.models.news.NewsAPIResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource getNewsPagingSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.String> getLastSearchQueries() {
        return null;
    }
    
    @java.lang.Override
    public boolean setLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean deleteLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.itworkxnews.data.models.news.Article>> getSavedNews() {
        return null;
    }
    
    @java.lang.Override
    public boolean isBookmarked(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl) {
        return false;
    }
}