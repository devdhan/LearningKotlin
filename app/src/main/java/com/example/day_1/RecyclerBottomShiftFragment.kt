package com.example.day_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day_1.databinding.FragmentRecyclerBinding
import com.example.day_1.databinding.FragmentRecyclerBottomShiftBinding
import com.example.day_1.recycler.RecyclerAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class RecyclerBottomShiftFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentRecyclerBottomShiftBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentRecyclerBottomShiftBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dismiss()
    }

    private fun showRecycler() {
//        itemsList.add("Sanni")
//        itemsList.add("Brycen")
//        itemsList.add("Gabriel")
//        itemsList.add("Itunu")
//        itemsList.add("Tamara")
//        itemsList.add("Shalom")
//        customAdapter.notifyDataSetChanged()
    }
}