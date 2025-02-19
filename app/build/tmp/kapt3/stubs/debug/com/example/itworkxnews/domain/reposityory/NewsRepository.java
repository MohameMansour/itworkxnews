package com.example.itworkxnews.domain.reposityory;

import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource;
import com.example.itworkxnews.data.utils.Resource;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u001c\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "", "deleteLastSearchQuery", "", "query", "", "deleteNewFromBookmarks", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSearchQueries", "", "getNewsHeadlines", "Lcom/example/itworkxnews/data/utils/Resource;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "country", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsPagingSource", "Lcom/example/itworkxnews/data/remote/data_source/paging_source/NewsRemotePagingSource;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "isBookmarked", "articleUrl", "saveNewFromBookmarks", "", "searchNews", "searchQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastSearchQuery", "app_debug"})
public abstract interface NewsRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String country, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.itworkxnews.data.remote.data_source.paging_source.NewsRemotePagingSource getNewsPagingSource();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.itworkxnews.data.models.news.Article>> getSavedNews();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> getLastSearchQueries();
    
    public abstract boolean setLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    public abstract boolean deleteLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    public abstract boolean isBookmarked(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}