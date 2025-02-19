package com.example.itworkxnews.di

import com.example.itworkxnews.data.remote.api.NewsAPIService
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}