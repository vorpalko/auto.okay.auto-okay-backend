package auto.okay

import auto.okay.features.login.configureLoginRouting
import auto.okay.features.register.configureRegisterRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import auto.okay.plugins.*
import io.ktor.http.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.defaultheaders.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(CORS) {
        allowHeader(HttpHeaders.ContentType)
        allowHeader(HttpHeaders.AccessControlAllowOrigin)
        allowHeader(HttpHeaders.AccessControlAllowHeaders)
        allowHeader(HttpHeaders.AccessControlAllowMethods)
    }
/*    install(DefaultHeaders) {
        header("Access-Control-Allow-Origin", "*")
        header("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, OPTIONS")
        header("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")
    }*/
    configureRouting()
    configureSerialization()
}
