package com.poly.androidlabs3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.poly.androidlabs3_5.databinding.Fragment3Binding

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment3Binding.inflate(layoutInflater)
        val navController = findNavController()
        binding.btnToFirst.setOnClickListener {
            navController.navigate(R.id.action_fragment3_to_fragment1)
        }
        binding.btnToSecond.setOnClickListener {
            navController.navigate(R.id.action_fragment3_to_fragment2)
        }
        binding.btnToAbout.setOnClickListener {
            (activity as MainActivity).goToAbout()
        }
        return binding.root
    }


}