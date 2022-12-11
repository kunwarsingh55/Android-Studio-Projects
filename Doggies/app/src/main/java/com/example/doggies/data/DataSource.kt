package com.example.doggies.data

import com.example.doggies.R
import com.example.doggies.model.Dog

class DataSource {
    fun loadDogs() : List<Dog>{
        return listOf<Dog>(
            Dog(R.drawable.bella,"Bella","3","Loves to eat Sofa"),
            Dog(R.drawable.faye, "Faye", "2","Sleep All Day"),
            Dog(R.drawable.frankie,"Frankie","4","Chew Everything"),
            Dog(R.drawable.nox,"Nox","1","Test patience of the owner"),
            Dog(R.drawable.leroy,"Leyor","2","Fight with cats"),
            Dog(R.drawable.tzeitel,"Tzeitel","3","Play in dog park")
        )
    }
}