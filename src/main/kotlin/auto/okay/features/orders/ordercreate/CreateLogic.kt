package auto.okay.features.orders.ordercreate

import auto.okay.features.orders.orderlist.OrderListLogic

object CreateLogic {

    fun create(request: CreateRequest): Boolean {
        val customerName = request.customerName ?: ""
        val customerPhone = request.customerPhone ?: ""
        val carName = request.carName ?: ""
        val carVinNumber = request.carVinNumber ?: ""
        val carMileage = request.carMileage ?: ""
        val problem = request.problem ?: ""
        val price = request.price ?: ""

        val order = CreateRequest(customerName, customerPhone, carName, carVinNumber, carMileage, problem, price)

        if (!OrderListLogic.orders.contains(order)) {
            OrderListLogic.orders += CreateRequest(customerName, customerPhone, carName, carVinNumber, carMileage, problem, price)
        }
        return true
    }

}