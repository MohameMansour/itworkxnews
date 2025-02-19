package com.example.itworkxnews.di


import com.example.itworkxnews.domain.reposityory.NewsRepository
import com.example.itworkxnews.domain.usecase.NewsUseCases
import com.example.itworkxnews.domain.usecase.SearchHistoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideNewsUseCases(nasaRepository: NewsRepository): NewsUseCases {
        return NewsUseCases(nasaRepository)
    }

    @Singleton
    @Provides
    fun provideSearchHistoryUseCase(nasaRepository: NewsRepository): SearchHistoryUseCase {
        return SearchHistoryUseCase(nasaRepository)
    }
}