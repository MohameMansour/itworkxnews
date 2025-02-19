package com.example.itworkxnews.presentation.views.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.itworkxnews.R
import com.example.itworkxnews.`data`.models.news.Article
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SearchFragmentDirections private constructor() {
  private data class ActionSearchFragmentToNewDetailFragment(
    public val article: Article
  ) : NavDirections {
    public override val actionId: Int = R.id.action_searchFragment_to_newDetailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
          result.putParcelable("article", this.article as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
          result.putSerializable("article", this.article as Serializable)
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionSearchFragmentToNewDetailFragment(article: Article): NavDirections =
        ActionSearchFragmentToNewDetailFragment(article)
  }
}
