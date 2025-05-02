package com.pdmtaller2.AbrahamFlores_00067323.model

data class Restaurant(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val menu: List<Dish>
)
