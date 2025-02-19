package com.example.itworkxnews.presentation.viewmodels;

import androidx.lifecycle.ViewModel;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/itworkxnews/presentation/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "(Lcom/example/itworkxnews/domain/usecase/NewsUseCases;)V", "bookmarksRecyclerViewAdapter", "Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;", "getBookmarksRecyclerViewAdapter", "()Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;", "setBookmarksRecyclerViewAdapter", "(Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;)V", "getAllBookmarks", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases = null;
    @javax.inject.Inject
    public com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter bookmarksRecyclerViewAdapter;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter getBookmarksRecyclerViewAdapter() {
        return null;
    }
    
    public final void setBookmarksRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter p0) {
    }
    
    public final void getAllBookmarks() {
    }
}