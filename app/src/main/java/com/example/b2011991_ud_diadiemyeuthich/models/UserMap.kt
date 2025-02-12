package com.example.b2011991_ud_diadiemyeuthich.models

import java.io.Serializable

data class UserMap(
    val title: String,
    val places: List<Place>
): Serializable
