package com.example.ejercicio5m6r.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejercicio5m6r.data.Repository
import com.example.ejercicio5m6r.data.remote.MartHotelRetrofitClient
import kotlinx.coroutines.launch

class MartHotelVM (application: Application):AndroidViewModel(application){

private val repository : Repository
init {
    val api = MartHotelRetrofitClient.getRetrofitMartHotel()
    repository = Repository(api)
}
fun getAllMartHotel()= viewModelScope.launch{
    repository.getMArtHotel()
}

}