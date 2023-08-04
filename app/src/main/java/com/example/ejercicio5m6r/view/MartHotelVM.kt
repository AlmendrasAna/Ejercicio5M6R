package com.example.ejercicio5m6r.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.ejercicio5m6r.data.Repository
import com.example.ejercicio5m6r.data.local.MartHotelDB
import com.example.ejercicio5m6r.data.remote.MartHotel
import com.example.ejercicio5m6r.data.remote.MartHotelRetrofitClient
import kotlinx.coroutines.launch

class MartHotelVM (application: Application):AndroidViewModel(application){

private val repository : Repository
fun martHotelLiveData () = repository.getMartHorel()

init {
    val api = MartHotelRetrofitClient.getRetrofitMartHotel()
    val martHotelDB = MartHotelDB.getDatabase(application).getDaoMartHotel()
    repository = Repository(api,martHotelDB)
}
fun getAllMartHotel()= viewModelScope.launch{

    repository.loadMartHote()
}

}