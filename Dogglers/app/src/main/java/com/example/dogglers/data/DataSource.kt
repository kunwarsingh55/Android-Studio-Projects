package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

class DataSource {
    fun getDogList(): List<Dog> {
        return listOf<Dog>(
            Dog(R.string.d1_name, R.string.d1_age, R.string.d1_hob, R.drawable.d1 ),
            Dog(R.string.d2_name, R.string.d2_age, R.string.d2_hob, R.drawable.d2 ),
            Dog(R.string.d3_name, R.string.d3_age, R.string.d3_hob, R.drawable.d3 ),
            Dog(R.string.d4_name, R.string.d4_age, R.string.d4_hob, R.drawable.d4 ),
            Dog(R.string.d5_name, R.string.d5_age, R.string.d5_hob, R.drawable.d5 )
        )
    }
}