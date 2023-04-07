package com.example.binnaapplicationn.ui.bookedplaces

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Booked Places Fragment"
    }
    val text: LiveData<String> = _text
}