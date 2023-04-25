package auto.okay.features.orders.ordercreate

import auto.okay.features.orders.OrderDto
import auto.okay.memory.DBController

object CreateOrderController {

    fun create(request: CreateOrderRequest): CreateOrderResponse {
        val customerName = request.customerName ?: ""
        val customerPhone = request.customerPhone ?: ""
        val carName = request.carName ?: ""
        val carVinNumber = request.carVinNumber ?: ""
        val carMileage = request.carMileage ?: ""
        val problem = request.problem ?: ""
        val price = request.price ?: ""

        val order = OrderDto(customerName, customerPhone, carName, carVinNumber, carMileage, problem, price)

        val success = DBController.addOrder(order)

        return CreateOrderResponse(success)
    }

}

