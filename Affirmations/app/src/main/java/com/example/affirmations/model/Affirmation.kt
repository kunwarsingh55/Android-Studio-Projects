package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


//When we make an instance of this affirmation class, we have to pass string resource ID
// of that affirmation so we need parameter stringResourceID
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)