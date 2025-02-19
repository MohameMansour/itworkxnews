package com.example.itworkxnews.presentation.views.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.search.SearchView;
import com.example.itworkxnews.core.base.BaseFragment;
import com.example.itworkxnews.core.base.BaseViewHolder;
import com.example.itworkxnews.data.models.news.Article;
import com.example.itworkxnews.data.utils.Resource;
import com.example.itworkxnews.databinding.FragmentSearchBinding;
import com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter;
import com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter;
import com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter;
import com.example.itworkxnews.presentation.viewmodels.SearchViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010\'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020$H\u0002J$\u0010*\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020$H\u0002J\u0010\u00104\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00065"}, d2 = {"Lcom/example/itworkxnews/presentation/views/search/SearchFragment;", "Lcom/example/itworkxnews/core/base/BaseFragment;", "Lcom/example/itworkxnews/databinding/FragmentSearchBinding;", "()V", "bookmarksRecyclerViewAdapter", "Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;", "getBookmarksRecyclerViewAdapter", "()Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;", "setBookmarksRecyclerViewAdapter", "(Lcom/example/itworkxnews/presentation/adapters/BookmarksRecyclerViewAdapter;)V", "lastSearchRecyclerViewAdapter", "Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter;", "getLastSearchRecyclerViewAdapter", "()Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter;", "setLastSearchRecyclerViewAdapter", "(Lcom/example/itworkxnews/presentation/adapters/LastSearchRecyclerViewAdapter;)V", "newsRecyclerViewAdapter", "Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter;", "getNewsRecyclerViewAdapter", "()Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter;", "setNewsRecyclerViewAdapter", "(Lcom/example/itworkxnews/presentation/adapters/NewsRecyclerViewAdapter;)V", "viewModel", "Lcom/example/itworkxnews/presentation/viewmodels/SearchViewModel;", "getViewModel", "()Lcom/example/itworkxnews/presentation/viewmodels/SearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "attachToParent", "", "hideSearchLottie", "", "initLastSearchRecyclerView", "initRecyclerView", "initSearchView", "observeLastSearchQueries", "observeSearchQuery", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setQuery", "query", "", "showSearchLottie", "showSearchResults", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SearchFragment extends com.example.itworkxnews.core.base.BaseFragment<com.example.itworkxnews.databinding.FragmentSearchBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter newsRecyclerViewAdapter;
    @javax.inject.Inject
    public com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter lastSearchRecyclerViewAdapter;
    @javax.inject.Inject
    public com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter bookmarksRecyclerViewAdapter;
    
    public SearchFragment() {
        super();
    }
    
    private final com.example.itworkxnews.presentation.viewmodels.SearchViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter getNewsRecyclerViewAdapter() {
        return null;
    }
    
    public final void setNewsRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.NewsRecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter getLastSearchRecyclerViewAdapter() {
        return null;
    }
    
    public final void setLastSearchRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.LastSearchRecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter getBookmarksRecyclerViewAdapter() {
        return null;
    }
    
    public final void setBookmarksRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.itworkxnews.databinding.FragmentSearchBinding getViewBinding(@org.jetbrains.annotations.NotNull
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
    
    private final void observeSearchQuery() {
    }
    
    private final void showSearchResults(java.lang.String query) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void observeLastSearchQueries() {
    }
    
    private final void initLastSearchRecyclerView() {
    }
    
    private final void initSearchView() {
    }
    
    private final void setQuery(java.lang.String query) {
    }
    
    private final void showSearchLottie() {
    }
    
    private final void hideSearchLottie() {
    }
}