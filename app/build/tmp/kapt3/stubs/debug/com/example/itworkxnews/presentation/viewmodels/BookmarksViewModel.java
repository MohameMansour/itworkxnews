package com.example.itworkxnews.presentation.viewmodels;

import androidx.lifecycle.ViewModel;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/itworkxnews/presentation/viewmodels/BookmarksViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "(Lcom/example/itworkxnews/domain/usecase/NewsUseCases;)V", "deleteSavedNews", "", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "(Lcom/example/itworkxnews/data/models/news/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBookmarks", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class BookmarksViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases = null;
    
    @javax.inject.Inject
    public BookmarksViewModel(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.itworkxnews.data.models.news.Article>> getAllBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteSavedNews(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}