package com.example.ejercicio5m6r.data

import android.util.Log
import com.example.ejercicio5m6r.data.remote.MartHotel
import com.example.ejercicio5m6r.data.remote.MartHotelApi

class Repository(private val martHorelApi : MartHotelApi) {


    suspend fun getMartHotel():List<MartHotel>{
        val response = martHorelApi.getDataFromID()
    if (response.isSuccessful){
       val bodyResponse= response.body()

    bodyResponse?.let {
        Log.e("lol","sd" )
        return it
    }
    }
        Log.e("lol","sddd" )
        return emptyList()
    }



}