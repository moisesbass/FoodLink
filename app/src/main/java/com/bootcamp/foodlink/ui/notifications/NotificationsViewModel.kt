package com.bootcamp.foodlink.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment de notificaciones de pedidos en preparacion y/o listos"
    }
    val text: LiveData<String> = _text
}