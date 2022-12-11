package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ItemAdapter
import com.example.dogglers.data.DataSource


class GridAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_avtivity)


        val dataSet = DataSource().getDogList()
        val gRecyclerView: RecyclerView = findViewById(R.id.grid_recycle)
        val numberOfColumns = 2
        gRecyclerView.layoutManager = GridLayoutManager(this, numberOfColumns)
        gRecyclerView.adapter =  ItemAdapter(this , dataSet, 3)

    }


}

