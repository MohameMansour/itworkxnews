package com.example.itworkxnews.presentation.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.example.itworkxnews.core.base.BaseViewHolder;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.databinding.ItemNewRowBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/NewsPagingDataAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/itworkxnews/data/models/news/Article;", "Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter$ViewHolder;", "()V", "onItemBookmarkListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemBookmarkListener", "setOnItemClickListener", "app_debug"})
public final class NewsPagingDataAdapter extends androidx.paging.PagingDataAdapter<com.example.itworkxnews.data.models.news.Article, com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder> {
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener;
    
    public NewsPagingDataAdapter() {
        super(null, null, null);
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener) {
    }
    
    public final void setOnItemBookmarkListener(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
}