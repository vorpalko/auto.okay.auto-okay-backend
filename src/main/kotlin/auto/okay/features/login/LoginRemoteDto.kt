package auto.okay.features.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginRemoteReceiveDto(
    val login: String,
    val password: String
)

@Serializable
data class LoginRemoteResponseDto(
    val success: Boolean
)
