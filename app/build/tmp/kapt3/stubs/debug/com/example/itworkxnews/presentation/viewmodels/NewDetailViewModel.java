package com.example.itworkxnews.presentation.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/itworkxnews/presentation/viewmodels/NewDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "(Lcom/example/itworkxnews/domain/usecase/NewsUseCases;)V", "_article", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/itworkxnews/data/models/news/Article;", "_isBookmarked", "", "article", "Landroidx/lifecycle/LiveData;", "getArticle", "()Landroidx/lifecycle/LiveData;", "isBookmarked", "addBookmark", "", "checkBookmark", "removeBookmark", "setArticle", "app_debug"})
public final class NewDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases = null;
    private final androidx.lifecycle.MutableLiveData<com.example.itworkxnews.data.models.news.Article> _article = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isBookmarked = null;
    
    @javax.inject.Inject
    public NewDetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.itworkxnews.data.models.news.Article> getArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isBookmarked() {
        return null;
    }
    
    public final void setArticle(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.data.models.news.Article article) {
    }
    
    public final void addBookmark() {
    }
    
    public final void removeBookmark() {
    }
    
    private final void checkBookmark(com.example.itworkxnews.data.models.news.Article article) {
    }
}