package com.example.itworkxnews.di;

import android.app.Application;
import com.example.itworkxnews.data.db.ArticleDAO;
import com.example.itworkxnews.data.local.cache.CacheManager;
import com.example.itworkxnews.data.local.cache.CacheManagerImpl;
import com.example.itworkxnews.data.local.data_source.NewsLocalDataSource;
import com.example.itworkxnews.data.local.data_source.NewsLocalDataSourceImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/itworkxnews/di/LocaleDataModule;", "", "()V", "provideCacheManager", "Lcom/example/itworkxnews/data/local/cache/CacheManager;", "application", "Landroid/app/Application;", "provideLocaleDataSource", "Lcom/example/itworkxnews/data/local/data_source/NewsLocalDataSource;", "articleDao", "Lcom/example/itworkxnews/data/db/ArticleDAO;", "app_debug"})
@dagger.Module
public final class LocaleDataModule {
    
    public LocaleDataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.itworkxnews.data.local.data_source.NewsLocalDataSource provideLocaleDataSource(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.db.ArticleDAO articleDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.itworkxnews.data.local.cache.CacheManager provideCacheManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
}