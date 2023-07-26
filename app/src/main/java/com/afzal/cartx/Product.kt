package com.afzal.cartx

data class Product(
    val id: Int,
    val name: String,
    val price: String,
    val imageId: Int,
    val delivery: String,
    val longDescription: String,
    val rating: Float,
    val ratingCount: String
)
