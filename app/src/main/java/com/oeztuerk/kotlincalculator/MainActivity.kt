package com.oeztuerk.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.oeztuerk.kotlincalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    fun addNumbers(view: View) {
        val a = binding.firstNumber.text.toString().toDoubleOrNull()
        val b = binding.secondNumber.text.toString().toDoubleOrNull()
        if (a != null && b != null) {
            val result = a + b
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter a number!"
        }

    }

    fun substractNumbers(view: View) {
        val a = binding.firstNumber.text.toString().toDoubleOrNull()
        val b = binding.secondNumber.text.toString().toDoubleOrNull()
        if (a != null && b != null) {
            val result = a - b
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter a number!"
        }

    }

    fun multiplyNumbers(view: View) {
        val a = binding.firstNumber.text.toString().toDoubleOrNull()
        val b = binding.secondNumber.text.toString().toDoubleOrNull()
        if (a != null && b != null) {
            val result = a * b
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter a number!"
        }

    }

    fun divideNumbers(view: View) {
        val a = binding.firstNumber.text.toString().toDoubleOrNull()
        val b = binding.secondNumber.text.toString().toDoubleOrNull()
        if (a != null && b != null) {
            val result = a / b
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter a number!"
        }

    }

}