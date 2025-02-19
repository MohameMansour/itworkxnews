package com.example.itworkxnews.presentation.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.itworkxnews.core.base.BaseViewHolder;
import com.example.itworkxnews.databinding.ItemLastSearchRowBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u0019\u001a\u00020\u000e2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter$ViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "onItemDeleteListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "setOnItemDeleteListener", "Companion", "ViewHolder", "app_debug"})
public final class LastSearchRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<java.lang.String> differ = null;
    private com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemDeleteListener;
    @org.jetbrains.annotations.NotNull
    public static final com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> DIFF_CALLBACK = null;
    
    public LastSearchRecyclerViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<java.lang.String> getDiffer() {
        return null;
    }
    
    public final void setOnItemDeleteListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemDeleteListener) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.core.base.BaseViewHolder.OnItemClickListener onItemClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter$ViewHolder;", "Lcom/example/itworkxnews/core/base/BaseViewHolder;", "binding", "Lcom/example/itworkxnews/databinding/ItemLastSearchRowBinding;", "(Lcom/example/itworkxnews/databinding/ItemLastSearchRowBinding;)V", "bind", "", "item", "", "setOnClickListener", "onItemClickListener", "Lcom/example/itworkxnews/core/base/BaseViewHolder$OnItemClickListener;", "setOnDeleteClickListener", "onItemDeleteListener", "Lkotlin/Function1;", "", "app_debug"})
    public static final class ViewHolder extends com.example.itworkxnews.core.base.BaseViewHolder {
        private final com.example.itworkxnews.databinding.ItemLastSearchRowBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.itworkxnews.databinding.ItemLastSearchRowBinding binding) {
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
        
        public final void setOnDeleteClickListener(@org.jetbrains.annotations.NotNull
        java.lang.Object item, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemDeleteListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> getDIFF_CALLBACK() {
            return null;
        }
    }
}