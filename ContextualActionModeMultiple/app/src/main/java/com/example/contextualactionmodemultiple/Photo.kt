package com.example.contextualactionmodemultiple

import java.util.*

data class Photo(
    val featuredImage: Int,
    val id: String = UUID.randomUUID().toString()
)
