package auto.okay.features.orders.orderlist

import auto.okay.features.orders.OrderDto
import kotlinx.serialization.Serializable

@Serializable
data class OrderListResponse(
    val orders: List<OrderDto>
)



