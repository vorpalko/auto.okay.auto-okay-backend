package auto.okay.features.orders.orderlist

import auto.okay.memory.DBController

object OrderListController {

    fun getOrderList(): OrderListResponse {
        return DBController.getAllOrders()
    }

}

