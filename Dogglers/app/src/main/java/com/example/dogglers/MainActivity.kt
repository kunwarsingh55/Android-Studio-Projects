package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verticalButton: Button = findViewById(R.id.vertical_button)
        verticalButton.setOnClickListener { verticalActivityLauncher() }

        val horizontalButton: Button = findViewById(R.id.horizontal_button)
        horizontalButton.setOnClickListener { horizontalActivityLauncher() }

        val gridButton: Button = findViewById(R.id.grid_button)
        gridButton.setOnClickListener { gridAvtivityLauncher() }


    }


    private fun gridAvtivityLauncher() {
        val intent = Intent(this, GridAvtivity::class.java)
        startActivity(intent)
    }

    private fun horizontalActivityLauncher() {
        val intent = Intent(this, HorizontalActivity::class.java)
        startActivity(intent)
    }

    private fun verticalActivityLauncher() {
        val intent = Intent(this, VerticalActivity::class.java)
        startActivity(intent)
    }
}