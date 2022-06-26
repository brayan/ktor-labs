package br.com.sailboat

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import br.com.sailboat.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureMonitoring()
    }.start(wait = true)
}
