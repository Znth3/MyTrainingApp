package com.example.mytrainingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editLenght: EditText
    private lateinit var editHeight: EditText
    private lateinit var btnCalculate: Button
    private lateinit var viewResult: TextView

    companion object{
        private const val STATE_RESULT = "State Result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editLenght = findViewById(R.id.edit_length)
        editHeight = findViewById(R.id.edit_height)
        btnCalculate = findViewById(R.id.btn_calculate)
        viewResult = findViewById(R.id.view_result)

        btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            viewResult.text = result
        }
    }



    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputLength = editLenght.text.toString().trim()
            val inputHeight = editHeight.text.toString().trim()

            var isEmptyFields = false

            when {
                inputLength.isEmpty() -> {
                    isEmptyFields = true
                    editLenght.error = "Field Cannot be Empty"
                }

                inputHeight.isEmpty() -> {
                    isEmptyFields = true
                    editHeight.error = "Field Cannot Be Empty"
                }

            }

            if (!isEmptyFields) {
                val result = inputLength.toDouble() * inputHeight.toDouble()
                viewResult.text = result.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, viewResult.text.toString())
    }
}