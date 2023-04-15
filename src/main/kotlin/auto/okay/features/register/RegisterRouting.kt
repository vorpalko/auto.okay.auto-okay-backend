package auto.okay.features.register

import auto.okay.cache.InMemoryCache
import auto.okay.features.login.LoginRemoteReceiveDto
import auto.okay.features.login.LoginRemoteResponseDto
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRegisterRouting() {
    routing {
        post("/register") {
            val receive = call.receive(RegisterReceiveDto::class)
            val isUserContains = InMemoryCache.userList.map { it.login }.contains(receive.login)

            if (isUserContains) return@post
            InMemoryCache.userList += receive

            return@post
        }
    }
}
