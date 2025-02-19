package com.example.itworkxnews.di


import com.example.itworkxnews.data.local.cache.CacheManager
import com.example.itworkxnews.data.local.data_source.NewsLocalDataSource
import com.example.itworkxnews.data.remote.data_source.NewsRemoteDataSource
import com.example.itworkxnews.domain.reposityory.NewsRepository
import com.example.itworkxnews.domain.reposityory.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource,
        cacheManager: CacheManager
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource,cacheManager)
    }

}