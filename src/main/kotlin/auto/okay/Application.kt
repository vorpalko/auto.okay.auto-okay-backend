package auto.okay

import auto.okay.features.login.configureLoginRouting
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
    configureCORS()
    configureHeaders()
    configureRouting()
    configureSerialization()
}
