package com.example.ascrollapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ascrollapplication.adapter.ItemAdapter
import com.example.ascrollapplication.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.adapter = ItemAdapter(this, myDataset)
        recyclerview.setHasFixedSize(true)
    }
}