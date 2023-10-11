package com.example.day_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.day_1.databinding.FragmentImageBinding

class ImageFragment : Fragment() {
    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getImage()
    }

    private fun getImage() {
        Glide.with(this).load("https://s3.amazonaws.com/appsdeveloperblog/Micky.jpg").into(binding.imageView3)

        Glide.with(this).load("https://s3.amazonaws.com/appsdeveloperblog/micky.gif").into(binding.imageView5)

    }
}