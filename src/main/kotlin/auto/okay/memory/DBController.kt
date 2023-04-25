package auto.okay.memory

import auto.okay.features.orders.OrderDto
import auto.okay.features.orders.orderlist.OrderListResponse
import auto.okay.features.login.dto.UserDto

object DBController {

    private val orders: ArrayList<OrderDto> = arrayListOf()

    private val userList: ArrayList<UserDto> = arrayListOf(
        UserDto("kirill", "12345")
    )

    fun addOrder(order: OrderDto): Boolean {
        val canAdd = !orders.contains(order)

        if (canAdd) orders += order

        return  canAdd
    }

    fun getAllOrders(): OrderListResponse {
        return OrderListResponse(orders)
    }

    fun getUsers(): List<UserDto> {
        return userList
    }

}

