package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ItemAdapter
import com.example.dogglers.data.DataSource


class HorizontalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizontal)

        val dataSet = DataSource().getDogList()
        val hRecyclerView: RecyclerView = findViewById(R.id.horizontal_recycle)
        hRecyclerView.adapter =  ItemAdapter(this , dataSet, 2)


    }
}