package com.example.huseyinmetecaliskan_todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.huseyinmetecaliskan_todoapp.databinding.FragmentFirstPageBinding


class FragmentFirstPage : Fragment() {

    private lateinit var binding: FragmentFirstPageBinding
    private lateinit var myAdapter: ToDoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFirstPageBinding.inflate(inflater,container,false)
        val itemList = mutableListOf<Item>()



        binding.btnAdd.setOnClickListener{
            val title = binding.etTitle.text.toString()
            val desc = binding.etDesc.text.toString()


            if(title.isEmpty() || desc.isEmpty()){
                Toast.makeText(requireContext(), "Fill all the blanks", Toast.LENGTH_SHORT).show()
            }
            else{

                val newItem = Item(title,desc)
                itemList.add(newItem)

                myAdapter = ToDoAdapter(itemList)
                binding.recyclerview.adapter = myAdapter
            }




            binding.etTitle.text.clear()
            binding.etDesc.text.clear()
        }




        return binding.root
    }

}