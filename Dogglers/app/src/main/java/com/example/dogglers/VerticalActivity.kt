package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ItemAdapter
import com.example.dogglers.data.DataSource


class VerticalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical)

        val dataSet = DataSource().getDogList()
        val vRecyclerView: RecyclerView = findViewById(R.id.vertical_recycle)
        vRecyclerView.adapter =  ItemAdapter(this , dataSet, 1)

        vRecyclerView.setHasFixedSize(true)
    }

}