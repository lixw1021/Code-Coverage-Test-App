package com.xianwei.codecoveragetestapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CalculatorViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    lateinit var testViewModel: CalculatorViewModel

    @Before
    fun setUp() {
        testViewModel = CalculatorViewModel()
    }

    @Test
    fun test_on_plus_click_method() {
        testViewModel.onPlusClicked(9, 2)
        assertEquals(11, testViewModel.state.value)
    }

    @Test
    fun test_on_minus_click_method() {
        testViewModel.onMinusClicked(9, 2)
        assertEquals(7, testViewModel.state.value)
    }

    @Test
    fun test_on_multiply_click_method() {
        testViewModel.onMultiplyClicked(9, 2)
        assertEquals(18, testViewModel.state.value)
    }

    @Test
    fun test_on_divider_click_method() {
        testViewModel.onDividerClicked(9, 3)
        assertEquals(3, testViewModel.state.value)
    }
}