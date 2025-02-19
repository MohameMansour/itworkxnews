package com.example.itworkxnews.presentation.viewmodels;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.AndroidViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/itworkxnews/presentation/viewmodels/NewsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "(Landroid/app/Application;Lcom/example/itworkxnews/domain/usecase/NewsUseCases;)V", "_pagingNews", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/itworkxnews/data/models/news/Article;", "pagingNews", "getPagingNews", "()Lkotlinx/coroutines/flow/Flow;", "addBookmark", "", "article", "checkBookmark", "", "deleteBookmark", "getPagingData", "openGithubRepo", "context", "Landroid/content/Context;", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases = null;
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.itworkxnews.data.models.news.Article>> _pagingNews;
    
    @javax.inject.Inject
    public NewsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application app, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.itworkxnews.data.models.news.Article>> getPagingNews() {
        return null;
    }
    
    private final void getPagingData() {
    }
    
    public final void openGithubRepo(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final boolean checkBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
        return false;
    }
    
    public final void addBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
    }
    
    public final void deleteBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
    }
}