package com.example.day_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day_1.databinding.FragmentImageBinding
import com.example.day_1.databinding.FragmentRecyclerBinding
import com.example.day_1.recycler.RecyclerAdapter

class RecyclerFragment : Fragment() {
    data class listOfFriends(val name: String, val type: FriendType)

    private val onClick = SingleLiveEvent<listOfFriends>()

    private val listOfFriendsItem = listOf(
        listOfFriends("Daniel", FriendType.FRIEND),
        listOfFriends("Lota", FriendType.FRIEND),
        listOfFriends("Mayokun", FriendType.FRIEND),
        listOfFriends("Tamara", FriendType.FRIEND),
        listOfFriends("Micheal", FriendType.FRIEND)
    )
    private lateinit var binding: FragmentRecyclerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentRecyclerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        RecyclerAdapter(listOfFriendsItem, onClick)
        binding.myRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.myRecyclerView.adapter = RecyclerAdapter(listOfFriendsItem, onClick)
        showRecycler()
    }

    private fun showRecycler() {
        onClick.observe(viewLifecycleOwner){
            when(it.type){
                FriendType.FRIEND-> sendMessage()
            }
        }
    }
    private fun sendMessage(){
        println("I am Tired")
        findNavController().navigate(R.id.recyclerBottomShiftFragment)
    }
}

enum class FriendType{
    FRIEND
}