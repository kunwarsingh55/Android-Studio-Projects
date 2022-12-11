package com.example.doggies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.doggies.adapter.DogAdapter
import com.example.doggies.data.DataSource

class Vertical : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical)

        val myData = DataSource().loadDogs()
        val recycleVertical = findViewById<RecyclerView>(R.id.verticalR)
        recycleVertical.adapter = DogAdapter(this,myData)
        recycleVertical.setHasFixedSize(true)
    }




}