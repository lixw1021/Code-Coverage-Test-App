package com.xianwei.codecoveragetestapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Assert.assertEquals

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

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
}