package com.example.ejercicio5m6r.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities =[MartHotelEntity::class], version =1)
abstract class MartHotelDB : RoomDatabase(){



    abstract fun getDaoMartHotel(): MartHotelDao


    companion object {
        @Volatile
        private var INSTANCE: MartHotelDB? = null

        fun getDatabase(context: Context):MartHotelDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MartHotelDB::class.java,
                    "tarea_db"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}