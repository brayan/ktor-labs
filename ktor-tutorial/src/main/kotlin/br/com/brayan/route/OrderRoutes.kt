package br.com.brayan.route

import br.com.brayan.model.orderStorage
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.orderRouting() {
    route("/order") {
        get {
            if (orderStorage.isNotEmpty()) {
                call.respond(orderStorage)
            }
        }

        get("{number?}") {
            val number = call.parameters["number"] ?: return@get call.respondText("Order number not informed", status = HttpStatusCode.BadRequest)
            val order = orderStorage.find { it.number == number } ?: return@get call.respondText("Order not found", status = HttpStatusCode.NotFound)
            call.respond(order)
        }

        get("{number?}/total") {
            val number = call.parameters["number"] ?: return@get call.respondText("Order number not informed", status = HttpStatusCode.BadRequest)
            val order = orderStorage.find { it.number == number } ?: return@get call.respondText("Order not found", status = HttpStatusCode.NotFound)

            val total = order.contents.sumOf { it.amount * it.price }
            call.respond(total)
        }
    }
}