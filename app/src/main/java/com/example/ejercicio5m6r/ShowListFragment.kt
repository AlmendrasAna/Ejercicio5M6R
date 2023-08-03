package com.example.ejercicio5m6r

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.ejercicio5m6r.databinding.FragmentShowListBinding
import com.example.ejercicio5m6r.view.MartHotelVM

class ShowListFragment : Fragment() {
   lateinit var  binding: FragmentShowListBinding
   private val martHotelvm : MartHotelVM by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

binding = FragmentShowListBinding.inflate(inflater, container, false)
    return binding.root
    }

}