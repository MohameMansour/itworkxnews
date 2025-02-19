package com.example.itworkxnews.domain.usecase;

import com.example.itworkxnews.domain.reposityory.NewsRepository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/itworkxnews/domain/usecase/SearchHistoryUseCase;", "", "newsRepository", "Lcom/example/itworkxnews/domain/reposityory/NewsRepository;", "(Lcom/example/itworkxnews/domain/reposityory/NewsRepository;)V", "addSearchQuery", "", "query", "", "clearSearchHistory", "getSearchHistory", "", "app_debug"})
public final class SearchHistoryUseCase {
    private final com.example.itworkxnews.domain.reposityory.NewsRepository newsRepository = null;
    
    public SearchHistoryUseCase(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.domain.reposityory.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSearchHistory() {
        return null;
    }
    
    public final boolean addSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    public final boolean clearSearchHistory(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
}