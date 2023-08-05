package com.example.ejercicio5m6r.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import coil.load
import com.example.ejercicio5m6r.R
import com.example.ejercicio5m6r.databinding.FragmentInfoBinding

private const val ARG_PARAM1 = "id"


class InfoFragment : Fragment() {
    private val martHotelvm : MartHotelVM by activityViewModels()
    private  lateinit var  binding : FragmentInfoBinding

    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInfoBinding.inflate(layoutInflater,container,false)

        martHotelvm.getOneMartHotelId(param1.toString()).observe(viewLifecycleOwner){

            binding.idTxt.text = it.id
            binding.precio.text = it.price.toString()
            binding.typeTxt.text = it.type.toString()

            binding.imaRoom.load(it.imgSrc){    crossfade(true)
                placeholder(R.drawable.baseline_cached_24)
            }


        }



        return binding.root

    }
    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InfoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)

                }
            }
    }
}