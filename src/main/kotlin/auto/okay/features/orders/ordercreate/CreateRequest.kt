package auto.okay.features.orders.ordercreate

import kotlinx.serialization.Serializable

@Serializable
data class CreateRequest(
    val customerName: String?,
    val customerPhone: String?,
    val carName: String?,
    val carVinNumber: String?,
    val carMileage: String?,
    val problem: String?,
    val price: String?
)