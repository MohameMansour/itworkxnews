package com.example.itworkxnews.data.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.itworkxnews.data.models.news.Article;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\'J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/itworkxnews/data/db/ArticleDAO;", "", "deleteWithId", "", "articleId", "deleteWithUrl", "articleUrl", "", "getAllSavedNews", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/itworkxnews/data/models/news/Article;", "insert", "", "article", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBookmarked", "", "app_debug"})
public abstract interface ArticleDAO {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM articles")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.itworkxnews.data.models.news.Article>> getAllSavedNews();
    
    @androidx.room.Query(value = "DELETE FROM articles WHERE url = :articleUrl")
    public abstract int deleteWithUrl(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl);
    
    @androidx.room.Query(value = "DELETE FROM articles WHERE id = :articleId")
    public abstract int deleteWithId(int articleId);
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM articles WHERE url = :articleUrl)")
    public abstract boolean isBookmarked(@org.jetbrains.annotations.NotNull
    java.lang.String articleUrl);
}