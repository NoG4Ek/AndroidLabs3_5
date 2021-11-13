package com.poly.androidlabs3_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_5.databinding.ActivityMainBinding
import androidx.navigation.Navigation.findNavController



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun goToAbout() {
//        val intent = Intent(this, ActivityAbout::class.java)
//        startActivity(intent)
        findNavController(this, R.id.nav_host_fragment).navigate(R.id.global_about)
    }
}