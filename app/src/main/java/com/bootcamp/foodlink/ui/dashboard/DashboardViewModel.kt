package com.bootcamp.foodlink.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pagina de cuenta total con el detalle"
    }
    val text: LiveData<String> = _text
}