package com.example.ejercicio5m6r.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface MartHotelApi {

    @GET("realestate")
   suspend fun getDataFromID():Response<List<MartHotel>>

}