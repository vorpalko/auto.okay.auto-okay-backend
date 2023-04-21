package auto.okay.cache

import auto.okay.features.register.RegisterReceiveDto

object InMemoryCache {

    val userList: ArrayList<RegisterReceiveDto> = arrayListOf(
        RegisterReceiveDto("jenya", "12345"),
        RegisterReceiveDto("artem", "12345"),
        RegisterReceiveDto("kirill", "12345"),
    )

}