package auto.okay.features.orders.orderlist

import auto.okay.features.orders.ordercreate.CreateRequest

object OrderListLogic {

    val orders: ArrayList<CreateRequest> = arrayListOf()

    fun getOrderList(): OrderListResponse {
        return OrderListResponse(orders)
    }

}