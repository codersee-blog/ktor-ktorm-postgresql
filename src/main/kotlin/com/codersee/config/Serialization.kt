package com.codersee.config

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
