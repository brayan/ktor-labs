package br.com.sailboat.route

import io.ktor.server.application.*
import io.ktor.server.routing.*

// We should add our server IP address in here:
private const val BASE_URL = "http://localhost:8080"

fun Route.randomRabbit() {
    get("/randomrabbit") {
        val rabbitId = call.parameters["rabbitId"]
    }
}
