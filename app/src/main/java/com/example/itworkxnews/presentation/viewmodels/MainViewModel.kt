package com.example.itworkxnews.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.itworkxnews.domain.usecase.NewsUseCases
import com.example.itworkxnews.presentation.adapters.BookmarksRecyclerViewAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val newsUseCases: NewsUseCases
): ViewModel() {

    @Inject
    lateinit var bookmarksRecyclerViewAdapter: BookmarksRecyclerViewAdapter


    fun getAllBookmarks() {
        viewModelScope.launch {
            newsUseCases.getSavedNews().collect {
                bookmarksRecyclerViewAdapter.differ.submitList(it)
            }
        }
    }

}