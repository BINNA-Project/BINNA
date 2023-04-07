package com.example.binnaapplicationn.ui.uploadedimages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UploadedimagesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Uploaded Images Fragment"
    }
    val text: LiveData<String> = _text
}