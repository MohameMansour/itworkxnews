package com.example.itworkxnews.core.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/example/itworkxnews/core/base/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "", "setOnClickListener", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "OnItemBookmarkListener", "OnItemClickListener", "app_debug"})
public abstract class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View itemView) {
        super(null);
    }
    
    public abstract void bind(@org.jetbrains.annotations.NotNull
    java.lang.Object item);
    
    public void setOnClickListener(@org.jetbrains.annotations.NotNull
    java.lang.Object item, @org.jetbrains.annotations.Nullable
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "", "onItemClick", "", "item", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        java.lang.Object item);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "", "onCheckBookmark", "", "item", "setOnItemBookmarkClick", "app_debug"})
    public static abstract interface OnItemBookmarkListener {
        
        public abstract boolean setOnItemBookmarkClick(@org.jetbrains.annotations.NotNull
        java.lang.Object item);
        
        public abstract boolean onCheckBookmark(@org.jetbrains.annotations.NotNull
        java.lang.Object item);
    }
}