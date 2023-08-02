package com.example.ejercicio5m6r.data.remote

import com.google.gson.annotations.SerializedName

data class MartHotel(
    val price: Long,
    val id: String,
    val type: String,
    @SerializedName("img_src") val imgSrc: String
)

/*
@SerializedName sirve para dar una pariedad entre nombres de variables con los nombres
de las columnas de las tablas
*/