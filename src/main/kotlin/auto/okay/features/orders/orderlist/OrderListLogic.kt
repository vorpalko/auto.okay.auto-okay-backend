package auto.okay.features.orders.orderlist

import auto.okay.features.orders.ordercreate.CreateRequest

object OrderListLogic {

    val orders: ArrayList<CreateRequest> = arrayListOf(
        CreateRequest("TestCustomer", "89874306949", "VAZ 2112", "3523", "3433", "broken", "1250 рублей")
    )

    fun getOrderList(): OrderListResponse {
        return OrderListResponse(orders)
    }

}