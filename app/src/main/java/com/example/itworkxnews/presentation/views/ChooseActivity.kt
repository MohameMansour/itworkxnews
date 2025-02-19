package com.example.itworkxnews.presentation.views

import android.content.Intent
import android.os.Bundle
import com.example.itworkxnews.core.base.BaseActivity
import com.example.itworkxnews.databinding.ActivityChooseBinding

class ChooseActivity : BaseActivity<ActivityChooseBinding>() {

    override fun getViewBinding(): ActivityChooseBinding {
        return ActivityChooseBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.clickBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }


}