package com.example.itworkxnews.presentation.views.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.example.itworkxnews.R;
import com.example.itworkxnews.core.base.BaseFragment;
import com.example.itworkxnews.core.base.BaseViewHolder;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.databinding.FragmentNewsBinding;
import com.example.itworkxnews.presentation.adapters.NewsPagingDataAdapter;
import com.example.itworkxnews.presentation.viewmodels.NewsViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006#"}, d2 = {"Lcom/example/itworkxnews/presentation/views/news/NewsFragment;", "Lcom/example/itworkxnews/core/base/BaseFragment;", "Lcom/example/itworkxnews/databinding/FragmentNewsBinding;", "()V", "newsPagingDataAdapter", "Lcom/example/itworkxnews/presentation/adapters/NewsPagingDataAdapter;", "getNewsPagingDataAdapter", "()Lcom/example/itworkxnews/presentation/adapters/NewsPagingDataAdapter;", "setNewsPagingDataAdapter", "(Lcom/example/itworkxnews/presentation/adapters/NewsPagingDataAdapter;)V", "viewModel", "Lcom/example/itworkxnews/presentation/viewmodels/NewsViewModel;", "getViewModel", "()Lcom/example/itworkxnews/presentation/viewmodels/NewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "attachToParent", "", "hideProgressBar", "", "initRecyclerView", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setTopAppBar", "showNewsListWithPagination", "showProgressBar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class NewsFragment extends com.example.itworkxnews.core.base.BaseFragment<com.example.itworkxnews.databinding.FragmentNewsBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.example.itworkxnews.presentation.adapters.NewsPagingDataAdapter newsPagingDataAdapter;
    
    public NewsFragment() {
        super();
    }
    
    private final com.example.itworkxnews.presentation.viewmodels.NewsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.presentation.adapters.NewsPagingDataAdapter getNewsPagingDataAdapter() {
        return null;
    }
    
    public final void setNewsPagingDataAdapter(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.NewsPagingDataAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.databinding.FragmentNewsBinding getViewBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, boolean attachToParent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setTopAppBar() {
    }
    
    private final void showNewsListWithPagination() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
}