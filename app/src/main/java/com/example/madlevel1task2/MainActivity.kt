package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val answerTT = binding.abFieldOne.text.toString().toUpperCase()
        val answerTF = binding.abFieldTwo.text.toString().toUpperCase()
        val answerFT = binding.abFieldThree.text.toString().toUpperCase()
        val answerFF = binding.abFieldFour.text.toString().toUpperCase()
        var correctAnswers = 0

        if (answerTT.isNotBlank() && answerTF.isNotBlank() && answerFT.isNotBlank() && answerFF.isNotBlank()) {

            if (answerTT.equals(getString(R.string.t))) {
                correctAnswers++
            }
            if (answerTF.equals(getString(R.string.f))) {
                correctAnswers++
            }
            if (answerFT.equals(getString(R.string.f))) {
                correctAnswers++
            }
            if (answerFF.equals(getString(R.string.f))) {
                correctAnswers++
            }

            Toast.makeText(
                this,
                getString(R.string.amount_correct, correctAnswers),
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(
                this,
                getString(R.string.empty_fields),
                Toast.LENGTH_LONG
            ).show()
        }
    }
}