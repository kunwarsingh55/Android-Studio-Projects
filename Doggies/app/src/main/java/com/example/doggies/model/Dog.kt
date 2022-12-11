package com.example.doggies.model

import androidx.annotation.DrawableRes

class Dog(
    @DrawableRes val dogImage: Int,
    val name: String,
    val age: String,
    val hobby: String
){
}