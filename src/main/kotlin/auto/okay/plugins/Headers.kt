package auto.okay.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

fun Application.configureHeaders() {
    install(DefaultHeaders) {
        header("Access-Control-Allow-Origin", "*")
        header("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS")
        header("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")
    }
}


