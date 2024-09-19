package com.example.home_work_6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.home_work_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var another_result: Int = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener { view: View? ->
            another_result++
            newCounterResult()
        }
        binding.btnMinus.setOnClickListener { view: View? ->
            another_result--
            newCounterResult()
        }
    }
    fun newCounterResult() {
        binding.tvResult.setText(another_result.toString())
    }
}