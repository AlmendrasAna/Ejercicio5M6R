package com.example.ejercicio5m6r.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "mart_hotel_db")
data class MartHotelEntity(
    @PrimaryKey var id :String,
    val price: Long,
    val type: String,
    val imgSrc: String
)