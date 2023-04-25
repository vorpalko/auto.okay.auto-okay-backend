package auto.okay.features.login

import auto.okay.features.login.dto.LoginRequest
import auto.okay.features.login.dto.LoginResponse
import auto.okay.memory.DBController

object LoginController {

    fun proceedUserLogin(request: LoginRequest): LoginResponse {
        val user = DBController.getUsers()
            .firstOrNull { it.login == request.login && it.password == request.password }

        return LoginResponse(user != null)
    }

}

