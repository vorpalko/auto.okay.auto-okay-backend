package auto.okay.features.orders.orderlist

import auto.okay.features.orders.ordercreate.CreateRequest
import kotlinx.serialization.Serializable

@Serializable
data class OrderListResponse(
    val orders: List<CreateRequest>
)