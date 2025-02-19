package com.example.itworkxnews.data.local.cache;

import android.content.Context;
import com.example.itworkxnews.core.enums.CacheManagerKeys;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/itworkxnews/data/local/cache/CacheManagerImpl;", "Lcom/example/itworkxnews/data/local/cache/CacheManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearSearchQueries", "", "deleteSearchQueryFromHistory", "query", "", "getLastSearchQueries", "", "setLastSearchQuery", "app_debug"})
public final class CacheManagerImpl implements com.example.itworkxnews.data.local.cache.CacheManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.Editor editor = null;
    
    public CacheManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public boolean setLastSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.String> getLastSearchQueries() {
        return null;
    }
    
    @java.lang.Override
    public boolean deleteSearchQueryFromHistory(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean clearSearchQueries() {
        return false;
    }
}