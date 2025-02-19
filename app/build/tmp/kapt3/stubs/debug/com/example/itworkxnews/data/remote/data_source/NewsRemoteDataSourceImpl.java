package com.example.itworkxnews.data.remote.data_source;

import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import com.example.itworkxnews.data.remote.api.NewsAPIService;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/itworkxnews/data/remote/data_source/NewsRemoteDataSourceImpl;", "Lcom/example/itworkxnews/data/remote/data_source/NewsRemoteDataSource;", "newsAPIService", "Lcom/example/itworkxnews/data/remote/api/NewsAPIService;", "(Lcom/example/itworkxnews/data/remote/api/NewsAPIService;)V", "getNewsHeadlines", "Lretrofit2/Response;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "country", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchNews", "searchQuery", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsRemoteDataSourceImpl implements com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource {
    private final com.example.itworkxnews.data.remote.api.NewsAPIService newsAPIService = null;
    
    public NewsRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.remote.api.NewsAPIService newsAPIService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String country, int pageNumber, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object searchNews(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation) {
        return null;
    }
}