package com.example.itworkxnews.domain.usecase;

import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource;
import com.example.itworkxnews.data.utils.Resource;
import com.example.itworkxnews.domain.reposityory.NewsRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eJ\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "", "newsRepository", "Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "(Lcom/example/itworkxnews/domain/reposityory/NewsRepository;)V", "deleteNewsFromBookmarks", "", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsHeadlines", "Lcom/example/itworkxnews/data/utils/Resource;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "country", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsPagingSource", "Lcom/example/itworkxnews/data/remote/data_source/paging_source/NewsRemotePagingSource;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "", "isBookmarked", "articleUrl", "saveNewFromBookmarks", "", "searchNews", "searchQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsUseCases {
    private final com.example.itworkxnews.domain.reposityory.NewsRepository newsRepository = null;
    
    public NewsUseCases(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.reposityory.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource getNewsPagingSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getNewsHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteNewsFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.itworkxnews.data.models.news.Article>> getSavedNews() {
        return null;
    }
    
    public final boolean isBookmarked(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl) {
        return false;
    }
}