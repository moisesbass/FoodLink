package com.bootcamp.foodlink.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Página con vista de los menus de comida"
    }
    val text: LiveData<String> = _text
}