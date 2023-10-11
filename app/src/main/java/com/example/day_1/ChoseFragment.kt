package com.example.day_1
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.day_1.databinding.FragmentChoseBinding
import com.example.day_1.databinding.FragmentSignUpBinding

class ChoseFragment : Fragment() {
    private lateinit var binding: FragmentChoseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChoseBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doChose()
    }
    private fun doChose() {
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}