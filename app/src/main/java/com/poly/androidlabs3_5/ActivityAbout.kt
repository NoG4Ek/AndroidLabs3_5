package com.poly.androidlabs3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_5.databinding.ActivityAboutBinding

class ActivityAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnBack.setOnClickListener {
            finish()
        }
    }
}