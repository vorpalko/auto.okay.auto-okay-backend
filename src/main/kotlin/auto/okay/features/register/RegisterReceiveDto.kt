package auto.okay.features.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterReceiveDto(
    val login: String,
    val password: String
)

@Serializable
data class RegisterResponseDto(
    val token: String
)