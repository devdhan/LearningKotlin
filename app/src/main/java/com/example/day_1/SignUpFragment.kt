package com.example.day_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.day_1.databinding.FragmentLoginBinding
import com.example.day_1.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSignUp()
    }

    private fun doSignUp() {
        binding.imageView7.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.button3.setOnClickListener{
            findNavController().navigate(R.id.action_signUpFragment_to_apiFragment3)
        }
    }
}