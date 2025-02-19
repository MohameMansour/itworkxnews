package com.example.itworkxnews.presentation.viewmodels;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.data.models.news.NewsAPIResponse;
import com.example.itworkxnews.data.utils.Resource;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import com.example.itworkxnews.domain.usecase.SearchHistoryUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000fR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006$"}, d2 = {"Lcom/example/itworkxnews/presentation/viewmodels/SearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "searchHistoryUseCase", "Lcom/example/itworkxnews/domain/usecase/SearchHistoryUseCase;", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "app", "Landroid/app/Application;", "(Lcom/example/itworkxnews/domain/usecase/SearchHistoryUseCase;Lcom/example/itworkxnews/domain/usecase/NewsUseCases;Landroid/app/Application;)V", "_news", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/itworkxnews/data/utils/Resource;", "Lcom/example/itworkxnews/data/models/news/NewsAPIResponse;", "_searchHistory", "", "", "_searchQuery", "news", "getNews", "()Landroidx/lifecycle/MutableLiveData;", "searchHistory", "getSearchHistory", "searchQuery", "getSearchQuery", "addBookmark", "", "article", "Lcom/example/itworkxnews/data/models/news/Article;", "addSearchQueryToHistory", "", "query", "checkBookmark", "deleteBookmark", "deleteSearchQueryFromHistory", "getNewsByQuery", "setSearchQuery", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.itworkxnews.domain.usecase.SearchHistoryUseCase searchHistoryUseCase = null;
    private final com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases = null;
    private final android.app.Application app = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _searchHistory = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _searchQuery = null;
    private final androidx.lifecycle.MutableLiveData<com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> _news = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.SearchHistoryUseCase searchHistoryUseCase, @org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases, @org.jetbrains.annotations.NotNull
    android.app.Application app) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getSearchHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.itworkxnews.data.utils.Resource<com.example.itworkxnews.data.models.news.NewsAPIResponse>> getNews() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void getNewsByQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void getSearchHistory() {
    }
    
    public final boolean addSearchQueryToHistory(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    public final void deleteSearchQueryFromHistory(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void addBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
    }
    
    public final void deleteBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
    }
    
    public final boolean checkBookmark(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
        return false;
    }
}