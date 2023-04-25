package auto.okay.features.orders.ordercreate

import kotlinx.serialization.Serializable

@Serializable
data class CreateOrderResponse(
    val success: Boolean
)


