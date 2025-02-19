package com.example.itworkxnews.data.local.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/example/itworkxnews/data/local/cache/CacheManager;", "", "clearSearchQueries", "", "deleteSearchQueryFromHistory", "query", "", "getLastSearchQueries", "", "setLastSearchQuery", "app_debug"})
public abstract interface CacheManager {
    
    public abstract boolean setLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> getLastSearchQueries();
    
    public abstract boolean deleteSearchQueryFromHistory(@org.jetbrains.annotations.NotNull
    java.lang.String query);
    
    public abstract boolean clearSearchQueries();
}