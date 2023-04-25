package auto.okay.plugins

import auto.okay.features.login.LoginController
import auto.okay.features.orders.ordercreate.CreateOrderController
import auto.okay.features.login.dto.LoginRequest
import auto.okay.features.orders.ordercreate.CreateOrderRequest
import auto.okay.features.orders.orderlist.OrderListController
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Auto-Okay server launched")
        }
        post("/login") {
            val request = call.receive(LoginRequest::class)
            val response = LoginController.proceedUserLogin(request)
            call.respond(response)
        }
        post("/createOrder") {
            val request = call.receive(CreateOrderRequest::class)
            val response = CreateOrderController.create(request)
            call.respond(response)
        }
        get("/orderList") {
            val response = OrderListController.getOrderList()
            call.respond(response)
        }
    }
}


