package com.example.itworkxnews.di;

import com.example.itworkxnews.domain.reposityory.NewsRepository;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import com.example.itworkxnews.domain.usecase.SearchHistoryUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/itworkxnews/di/UseCaseModule;", "", "()V", "provideNewsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "nasaRepository", "Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "provideSearchHistoryUseCase", "Lcom/example/itworkxnews/domain/usecase/SearchHistoryUseCase;", "app_debug"})
@dagger.Module
public final class UseCaseModule {
    
    public UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.itworkxnews.domain.usecase.NewsUseCases provideNewsUseCases(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.reposityory.NewsRepository nasaRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.itworkxnews.domain.usecase.SearchHistoryUseCase provideSearchHistoryUseCase(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.reposityory.NewsRepository nasaRepository) {
        return null;
    }
}