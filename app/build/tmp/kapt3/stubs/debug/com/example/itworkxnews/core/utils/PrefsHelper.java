package com.example.itworkxnews.core.utils;

import android.content.Context;
import android.content.SharedPreferences;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/itworkxnews/core/utils/PrefsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "isFirstLaunch", "", "setIsFirstLaunch", "", "Companion", "app_debug"})
public final class PrefsHelper {
    private final android.content.SharedPreferences sharedPref = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.itworkxnews.core.utils.PrefsHelper.Companion Companion = null;
    private static final java.lang.String IS_FIRST_LAUNCH = "is_first_launch";
    
    public PrefsHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void setIsFirstLaunch(boolean isFirstLaunch) {
    }
    
    public final boolean isFirstLaunch() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/itworkxnews/core/utils/PrefsHelper$Companion;", "", "()V", "IS_FIRST_LAUNCH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}