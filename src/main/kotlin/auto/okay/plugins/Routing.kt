package auto.okay.plugins

import auto.okay.cache.InMemoryCache
import auto.okay.features.orders.ordercreate.CreateLogic
import auto.okay.features.orders.ordercreate.CreateRequest
import auto.okay.features.login.LoginRemoteReceiveDto
import auto.okay.features.login.LoginRemoteResponseDto
import auto.okay.features.orders.orderlist.OrderListLogic
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable

@Serializable
data class Test(
    val text: String
)

fun Application.configureRouting() {
    routing {
        post("/login") {
            val receive = call.receive(LoginRemoteReceiveDto::class)
            val loginSucceed = InMemoryCache.userList.firstOrNull { it.login == receive.login && it.password == receive.password }
            call.respond(LoginRemoteResponseDto(loginSucceed != null))
            return@post
        }
        post("/createOrder") {
            val receive = call.receive(CreateRequest::class)
            CreateLogic.create(receive)
            return@post
        }
        get("/orderList") {
            call.respond(OrderListLogic.getOrderList())
        }
    }
}
