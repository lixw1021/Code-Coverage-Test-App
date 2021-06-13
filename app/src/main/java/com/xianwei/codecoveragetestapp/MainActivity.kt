package com.xianwei.codecoveragetestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.xianwei.codecoveragetestapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: CalculatorViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    private val inputA get() = binding.inputA.text.toString().toInt()
    private val inputB get() = binding.inputB.text.toString().toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupButtons()
        viewModel.state.observeForever {
            binding.result.text = it.toString()
        }
    }

    private fun setupButtons() {

        binding.plus.setOnClickListener {
            if (validInput()) {
                viewModel.onPlusClicked(inputA, inputB)
                binding.sign.text = "+"
            }
        }

        binding.minus.setOnClickListener {
            if (validInput()) {
                viewModel.onMinusClicked(inputA, inputB)
                binding.sign.text = "-"
            }
        }

        binding.multiply.setOnClickListener {
            if (validInput()) {
                viewModel.onMultiplyClicked(inputA, inputB)
                binding.sign.text = "*"
            }
        }

        binding.divider.setOnClickListener {
            if (validInput()) {
                viewModel.onDividerClicked(inputA, inputB)
                binding.sign.text = "/"
            }
        }
    }

    private fun validInput(): Boolean =
        if (binding.inputA.length() > 0 && binding.inputB.length() > 0) {
            true
        } else {
            Toast.makeText(baseContext, "Please input a valid value", Toast.LENGTH_SHORT).show()
            false
        }
}