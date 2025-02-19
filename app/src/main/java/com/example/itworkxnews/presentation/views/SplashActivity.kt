package com.example.itworkxnews.presentation.views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.itworkxnews.R
import com.example.itworkxnews.core.constants.SPLASH_SCREEN_DURATION
import com.example.itworkxnews.core.utils.PrefsHelper

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var prefsHelper: PrefsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        navigateToMainActivity()
    }

    private fun navigateToMainActivity() {
        Handler(mainLooper).postDelayed({

            prefsHelper = PrefsHelper(this)

            if (prefsHelper.isFirstLaunch()) {
                startActivity(Intent(this, ChooseActivity::class.java))
                startActivity(intent)
                prefsHelper.setIsFirstLaunch(false)
            } else {
                startActivity(Intent(this, MainActivity::class.java))
                startActivity(intent)
            }
            finish()
        }, SPLASH_SCREEN_DURATION)
    }

}