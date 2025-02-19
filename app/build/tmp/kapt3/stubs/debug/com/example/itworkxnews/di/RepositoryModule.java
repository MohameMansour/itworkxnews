package com.example.itworkxnews.di;

import com.example.itworkxnews.data.local.cache.CacheManager;
import com.example.itworkxnews.data.local.data_source.NewsLocalDataSource;
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource;
import com.example.itworkxnews.domain.reposityory.NewsRepository;
import com.example.itworkxnews.domain.reposityory.NewsRepositoryImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/itworkxnews/di/RepositoryModule;", "", "()V", "provideNewsRepository", "Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "newsRemoteDataSource", "Lcom/example/itworkxnews/data/remote/data_source/NewsRemoteDataSource;", "newsLocalDataSource", "Lcom/example/itworkxnews/data/local/data_source/NewsLocalDataSource;", "cacheManager", "Lcom/example/itworkxnews/data/local/cache/CacheManager;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.itworkxnews.domain.reposityory.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource newsRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.local.data_source.NewsLocalDataSource newsLocalDataSource, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.local.cache.CacheManager cacheManager) {
        return null;
    }
}