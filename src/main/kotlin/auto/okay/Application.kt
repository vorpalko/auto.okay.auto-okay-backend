package auto.okay

import auto.okay.features.login.configureLoginRouting
import auto.okay.features.register.configureRegisterRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import auto.okay.plugins.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.defaultheaders.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(DefaultHeaders) {
        header("Access-Control-Allow-Origin", "'*'")
    }
    configureRouting()
    configureSerialization()
}
