package com.codersee

import com.codersee.config.configureSerialization
import com.codersee.route.configureBookRoutes
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureBookRoutes()
        configureSerialization()
    }.start(wait = true)
}
