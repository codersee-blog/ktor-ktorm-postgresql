package com.codersee.model

import kotlinx.serialization.Serializable

@Serializable
data class BookRequest(
    val name: String
)