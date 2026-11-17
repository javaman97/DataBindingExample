package com.aman.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {

    val name = MutableLiveData("Aman")

    val quote = MutableLiveData("Tit for Tat")

    fun updateQuote() {
        quote.value = "Updated Quote"
    }
}