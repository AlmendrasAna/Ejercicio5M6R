package com.example.ejercicio5m6r.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.ejercicio5m6r.data.local.MartHotelDao
import com.example.ejercicio5m6r.data.local.MartHotelEntity
import com.example.ejercicio5m6r.data.remote.MartHotel
import com.example.ejercicio5m6r.data.remote.MartHotelApi

class Repository(private val martHorelApi: MartHotelApi, private val martHotelDao: MartHotelDao) {

    fun getMartHorel(): LiveData<List<MartHotelEntity>> = martHotelDao.getMartHotel()

    suspend fun loadMartHote() {
        val response = martHorelApi.getDataFromID()
        if (response.isSuccessful) {
            val bodyResponse = response.body()

            bodyResponse?.let {
                martHotels ->
                val martHotelEntity = martHotels.map { it.toEntity()
               }
                martHotelDao.insertsMartHotels(martHotelEntity)
            }
        }

    }


}
fun MartHotel.toEntity(): MartHotelEntity = MartHotelEntity(this.id,this.price,this.type,this.imgSrc)