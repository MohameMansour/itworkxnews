package com.example.itworkxnews.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.itworkxnews.data.models.news.Article;

@androidx.room.TypeConverters(value = {com.example.itworkxnews.data.db.Converters.class})
@androidx.room.Database(entities = {com.example.itworkxnews.data.models.news.Article.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/itworkxnews/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "articleDAO", "Lcom/example/itworkxnews/data/db/ArticleDAO;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.itworkxnews.data.db.ArticleDAO articleDAO();
}