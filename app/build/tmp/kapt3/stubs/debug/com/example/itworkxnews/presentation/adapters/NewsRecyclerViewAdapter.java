package com.example.itworkxnews.presentation.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.itworkxnews.R;
import com.example.itworkxnews.core.base.BaseViewHolder;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.databinding.ItemNewRowBinding;
import com.example.itworkxnews.domain.usecase.NewsUseCases;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter$ViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/itworkxnews/data/models/news/Article;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemBookmarkListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemBookmarkListener", "setOnItemClickListener", "Companion", "ViewHolder", "app_debug"})
public final class NewsRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.itworkxnews.data.models.news.Article> differ = null;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener;
    @org.jetbrains.annotations.NotNull
    public static final com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.itworkxnews.data.models.news.Article> DIFF_CALLBACK = null;
    
    public NewsRecyclerViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.itworkxnews.data.models.news.Article> getDiffer() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener) {
    }
    
    public final void setOnItemBookmarkListener(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter$ViewHolder;", "Lcom/example/itworkxnews/core/base/BaseViewHolder;", "binding", "Lcom/example/itworkxnews/databinding/ItemNewRowBinding;", "(Lcom/example/itworkxnews/databinding/ItemNewRowBinding;)V", "newsUseCases", "Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "getNewsUseCases", "()Lcom/example/itworkxnews/domain/usecase/NewsUseCases;", "setNewsUseCases", "(Lcom/example/itworkxnews/domain/usecase/NewsUseCases;)V", "bind", "", "item", "", "bookmarkButtonClicked", "currentArticle", "Lcom/example/itworkxnews/data/models/news/Article;", "onItemBookmarkListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "notifyCallback", "Lkotlin/Function0;", "checkBookmark", "setOnClickListener", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "app_debug"})
    public static final class ViewHolder extends com.example.itworkxnews.core.base.BaseViewHolder {
        private final com.example.itworkxnews.databinding.ItemNewRowBinding binding = null;
        @javax.inject.Inject
        public com.example.itworkxnews.domain.usecase.NewsUseCases newsUseCases;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.databinding.ItemNewRowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.itworkxnews.domain.usecase.NewsUseCases getNewsUseCases() {
            return null;
        }
        
        public final void setNewsUseCases(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.domain.usecase.NewsUseCases p0) {
        }
        
        @java.lang.Override
        public void bind(@org.jetbrains.annotations.NotNull
        java.lang.Object item) {
        }
        
        @java.lang.Override
        public void setOnClickListener(@org.jetbrains.annotations.NotNull
        java.lang.Object item, @org.jetbrains.annotations.Nullable
        com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener) {
        }
        
        public final void checkBookmark(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.data.models.news.Article currentArticle, @org.jetbrains.annotations.Nullable
        com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener) {
        }
        
        public final void bookmarkButtonClicked(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.data.models.news.Article currentArticle, @org.jetbrains.annotations.Nullable
        com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> notifyCallback) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/itworkxnews/data/models/news/Article;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.itworkxnews.data.models.news.Article> getDIFF_CALLBACK() {
            return null;
        }
    }
}