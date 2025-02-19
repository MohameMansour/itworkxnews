package com.example.itworkxnews.data.local.data_source;

import com.example.itworkxnews.data.models.news.Article;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/itworkxnews/data/local/data_source/NewsLocalDataSource;", "", "deleteNewFromBookmarks", "", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Lkotlinx/coroutines/flow/Flow;", "", "isBookmarked", "articleUrl", "", "saveNewFromBookmarks", "", "app_debug"})
public abstract interface NewsLocalDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.itworkxnews.data.models.news.Article>> getSavedNews();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNewFromBookmarks(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    public abstract boolean isBookmarked(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl);
}