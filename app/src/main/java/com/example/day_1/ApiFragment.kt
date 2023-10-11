package com.example.day_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.day_1.api.JokesRepository
import com.example.day_1.databinding.FragmentApiBinding

class ApiFragment : Fragment() {

    private lateinit var binding: FragmentApiBinding

 override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
     binding = FragmentApiBinding.inflate(layoutInflater)
     return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        callApi()
    }

    private fun callApi() {
        binding.button5.setOnClickListener{

            //show the progress bar
            binding.progressBar.visibility = View.VISIBLE

            //call the getJokes method from the repoclass
            JokesRepository().getjokes(requireContext()){

                //set text to the textview displaying the jokes
                binding.textView7.visibility = View.VISIBLE
                binding.textView7.text = it.value

                //hide the progress bar
                binding.progressBar.visibility = View.GONE
            }
        }
        binding.button6.setOnClickListener{
            findNavController().navigate(R.id.action_apiFragment_to_imageFragment)
        }
        binding.button7.setOnClickListener{
            findNavController().navigate(R.id.action_apiFragment_to_recyclerFragment)
        }
    }
}