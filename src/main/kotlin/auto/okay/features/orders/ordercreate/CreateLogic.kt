package auto.okay.features.orders.ordercreate

import auto.okay.features.orders.orderlist.OrderListLogic

object CreateLogic {

    fun create(request: CreateRequest) {
        val customerName = request.customerName ?: ""
        val customerPhone = request.customerPhone ?: ""
        val carName = request.carName ?: ""
        val carVinNumber = request.carVinNumber ?: ""
        val carMileage = request.carMileage ?: ""
        val problem = request.problem ?: ""
        val price = request.price ?: ""

        OrderListLogic.orders += CreateRequest(customerName, customerPhone, carName, carVinNumber, carMileage, problem, price)
    }

}