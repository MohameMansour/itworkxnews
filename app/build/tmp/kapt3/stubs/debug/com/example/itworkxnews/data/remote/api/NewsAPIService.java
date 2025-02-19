package com.example.itworkxnews.data.remote.api;

import com.example.itworkxnews.core.enums.SearchNewsQueries;
import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/itworkxnews/data/remote/api/NewsAPIService;", "", "getNewsHeadlines", "Lretrofit2/Response;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "country", "", "pageNumber", "", "apikey", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchNews", "searchQuery", "searchIn", "sortBy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsAPIService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v2/top-headlines")
    public abstract java.lang.Object getNewsHeadlines(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "country")
    java.lang.String country, @retrofit2.http.Query(value = "page")
    int pageNumber, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apikey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "v2/everything")
    public abstract java.lang.Object getSearchNews(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "searchIn")
    java.lang.String searchIn, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "sortBy")
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apikey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.itworkxnews.data.models.news.NewsAPIResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}