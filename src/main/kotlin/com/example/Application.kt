package com.example

import com.example.dao.DatabaseFactory
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "192.168.0.15") {
        DatabaseFactory.init()
        configureRouting()
       // configureSerialization()
        configureSecurity()
        configureTemplating()
    }.start(wait = true)
}
