package com.example.day_1.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.day_1.R
import com.example.day_1.RecyclerFragment
import com.example.day_1.SingleLiveEvent

class RecyclerAdapter(private var listOfFriends: List<RecyclerFragment.listOfFriends>, private val onClick: SingleLiveEvent<RecyclerFragment.listOfFriends>): RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> (){
    //var onItemClick: ((itemsList) -> Unit) = null
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var itemTextView: TextView = view.findViewById(R.id.textView11)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = listOfFriends[position]
        holder.itemTextView.text = item.name
        holder.itemTextView.setOnClickListener{
            println("I am hungry")
            onClick.value = item
        }
    }

    override fun getItemCount(): Int {
        return listOfFriends.size
    }
}