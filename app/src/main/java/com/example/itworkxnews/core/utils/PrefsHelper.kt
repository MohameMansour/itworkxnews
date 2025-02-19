package com.example.itworkxnews.core.utils

import android.content.Context
import android.content.SharedPreferences

class PrefsHelper(context: Context) {

    private val sharedPref: SharedPreferences =
        context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    companion object {
        private const val IS_FIRST_LAUNCH = "is_first_launch"
    }

    fun setIsFirstLaunch(isFirstLaunch: Boolean) {
        sharedPref.edit().putBoolean(IS_FIRST_LAUNCH, isFirstLaunch).apply()
    }

    fun isFirstLaunch(): Boolean {
        return sharedPref.getBoolean(IS_FIRST_LAUNCH, true)
    }

}