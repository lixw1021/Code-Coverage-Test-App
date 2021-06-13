package com.xianwei.codecoveragetestapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    val state : MutableLiveData<Int> = MutableLiveData(0)

    fun onPlusClicked(inputA: Int, inputB: Int) {
        state.value = inputA + inputB
    }

    fun onMinusClicked(inputA: Int, inputB: Int) {
        state.value = inputA - inputB
    }

    fun onMultiplyClicked(inputA: Int, inputB: Int) {
        state.value = inputA * inputB
    }

    fun onDividerClicked(inputA: Int, inputB: Int) {
        state.value = inputA / inputB
    }

}