package com.example.ejercicio5m6r.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MartHotelRetrofitClient {
    companion object {
        private const val URL_BASE = "https://android-kotlin-fun-mars-server.appspot.com/"

        fun getRetrofitMartHotel(): MartHotelApi {
            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)

                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mRetrofit.create(MartHotelApi::class.java)
        }
    }
}