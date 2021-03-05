package com.example.mytrainingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveToCountActivity: Button = findViewById(R.id.btn_move_count)
        btnMoveToCountActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_count -> {
                val moveIntent = Intent(this@MainActivity, CountActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}