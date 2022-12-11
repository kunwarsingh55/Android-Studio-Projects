package com.example.doggies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verticalB : Button = findViewById(R.id.verticalButton)
        verticalB.setOnClickListener { verticalActivityLauncher() }

    }
    private fun verticalActivityLauncher(){
        val intent = Intent(this, Vertical::class.java)
        startActivity(intent)
    }

}

