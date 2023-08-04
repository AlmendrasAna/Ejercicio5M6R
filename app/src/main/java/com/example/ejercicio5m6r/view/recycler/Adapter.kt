package com.example.ejercicio5m6r.view.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ejercicio5m6r.R
import com.example.ejercicio5m6r.data.local.MartHotelEntity
import com.example.ejercicio5m6r.data.remote.MartHotel
import com.example.ejercicio5m6r.databinding.ItemBinding


class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {


    private var martHotels: List<MartHotelEntity> = emptyList()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return martHotels.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val martHotel = martHotels[position]
        holder.bind(martHotel)
    }

    fun setData(martHotel: List<MartHotelEntity>) {
        this.martHotels = martHotel

        notifyDataSetChanged()
    }


    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(martHotel: MartHotelEntity) {
            binding.imageSrcIma.load(martHotel.imgSrc){    crossfade(true)
                placeholder(R.drawable.baseline_cached_24)
            }

            binding.nameTerreno.text = martHotel.id
            Log.e("lol", "bind: ${martHotel.id}", )
        }


    }

}