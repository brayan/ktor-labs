package br.com.brayan.plugins

import br.com.brayan.route.customerRouting
import br.com.brayan.route.orderRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        customerRouting()
        orderRouting()
    }
}
