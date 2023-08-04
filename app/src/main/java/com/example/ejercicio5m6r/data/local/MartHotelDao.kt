package com.example.ejercicio5m6r.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MartHotelDao {
    @Insert
suspend fun insertarMartHotel(martHotelEntity: MartHotelEntity)

    @Query("select * from mart_hotel_db order by id ASC ")
    fun getMartHotel() : LiveData<List<MartHotelEntity>>
}

