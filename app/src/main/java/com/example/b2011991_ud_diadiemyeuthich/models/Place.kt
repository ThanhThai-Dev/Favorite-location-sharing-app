package com.example.b2011991_ud_diadiemyeuthich.models

import java.io.Serializable

data class Place(
    val title: String,
    val description: String,
    val latitude: Double,
    val longitude: Double
): Serializable
