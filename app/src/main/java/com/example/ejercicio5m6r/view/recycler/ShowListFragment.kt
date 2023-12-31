package com.example.ejercicio5m6r.view.recycler

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import com.example.ejercicio5m6r.data.remote.MartHotel
import com.example.ejercicio5m6r.databinding.FragmentShowListBinding
import com.example.ejercicio5m6r.view.MartHotelVM

class ShowListFragment : Fragment() {
   lateinit var  binding: FragmentShowListBinding
   private val martHotelvm : MartHotelVM by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

binding = FragmentShowListBinding.inflate(inflater, container, false)
        Log.e("lol", "initAdapter: perro" )


   binding.showListB.setOnClickListener {

       martHotelvm.getAllMartHotel()
       initAdapter()
   }
    return binding.root

    }

    private fun initAdapter() {

        val adapter = Adapter()

        binding.recyclerView.adapter = adapter

        martHotelvm.martHotelLiveData().observe(viewLifecycleOwner){

            adapter.setData(it)
        }

    }


}