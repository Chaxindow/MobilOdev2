package com.example.huseyinmetecaliskan_todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.huseyinmetecaliskan_todoapp.databinding.ListItemBinding

class ToDoAdapter(private val list : MutableList<Item>) : RecyclerView.Adapter<ToDoAdapter.MyListViewHolder>() {

    inner class MyListViewHolder(private val binding : ListItemBinding):RecyclerView.ViewHolder(binding.root){


        init {
            binding.imageButton.setOnClickListener{
                // Toast.makeText(it.context, "Item deleted", Toast.LENGTH_SHORT).show()
                list.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }
        }


        fun bind(getList: Item){
            binding.tvTitle.text = getList.title
            binding.tvDesc.text = getList.description
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListViewHolder{

        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size




}


