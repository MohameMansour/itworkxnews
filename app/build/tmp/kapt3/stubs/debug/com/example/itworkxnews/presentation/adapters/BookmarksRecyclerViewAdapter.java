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

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter$ViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/itworkxnews/data/models/news/Article;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemBookmarkListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemBookmarkListener", "setOnItemClickListener", "Companion", "ViewHolder", "app_debug"})
public final class BookmarksRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.itworkxnews.data.models.news.Article> differ = null;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener;
    @org.jetbrains.annotations.NotNull
    public static final com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.itworkxnews.data.models.news.Article> DIFF_CALLBACK = null;
    
    public BookmarksRecyclerViewAdapter() {
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
    public com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter$ViewHolder;", "Lcom/example/itworkxnews/core/base/BaseViewHolder;", "binding", "Lcom/example/itworkxnews/databinding/ItemNewRowBinding;", "(Lcom/example/itworkxnews/databinding/ItemNewRowBinding;)V", "bind", "", "item", "", "setOnBookmarkClickListener", "onItemBookmarkListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemBookmarkListener;", "setOnClickListener", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "app_debug"})
    public static final class ViewHolder extends com.example.itworkxnews.core.base.BaseViewHolder {
        private final com.example.itworkxnews.databinding.ItemNewRowBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.databinding.ItemNewRowBinding binding) {
            super(null);
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
        
        public final void setOnBookmarkClickListener(@org.jetbrains.annotations.NotNull
        java.lang.Object item, @org.jetbrains.annotations.Nullable
        com.example.itworkxnews.core.base.BaseViewHolder.OnItemBookmarkListener onItemBookmarkListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/itworkxnews/data/models/news/Article;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}