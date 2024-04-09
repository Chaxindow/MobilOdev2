package com.example.huseyinmetecaliskan_todoapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.huseyinmetecaliskan_todoapp.databinding.FragmentHomePageBinding


class HomePage : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomePageBinding.inflate(inflater,container,false)

        binding.btnBtn.setOnClickListener(){
            Navigation.findNavController(requireView()).navigate(R.id.action_homePage_to_fragmentFirstPage)
        }


        // Inflate the layout for this fragment
        return binding.root
    }


}