package com.example.mytrainingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveToCountActivity: Button = findViewById(R.id.btn_move_count)
        btnMoveToCountActivity.setOnClickListener(this)

        val btnMoveToCountActivityWithData : Button = findViewById(R.id.btn_move_with_data)
        btnMoveToCountActivityWithData.setOnClickListener(this)

        val btnImplicitCalculator: Button = findViewById(R.id.btn_implicit_calculator)
        btnImplicitCalculator.setOnClickListener(this)

        val btnMoveViewGroup: Button = findViewById(R.id.btn_move_viewGroup)
        btnMoveViewGroup.setOnClickListener(this)

        val btnMoveToRecyclerView: Button = findViewById(R.id.btn_move_recycler)
        btnMoveToRecyclerView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_count -> {
                val moveIntent = Intent(this@MainActivity, CountActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_with_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Raya")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_implicit_calculator -> {
                val openCalculator = Intent(Intent.CATEGORY_APP_CALCULATOR)
                startActivity(openCalculator)
            }

            R.id.btn_move_viewGroup -> {
                val moveViewGroupIntent = Intent(this@MainActivity, ViewAndViewsActivity::class.java)
                startActivity(moveViewGroupIntent)
            }

            R.id.btn_move_recycler -> {
                val moveToRecyclerViewIntent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
                startActivity(moveToRecyclerViewIntent)
            }

        }
    }
}