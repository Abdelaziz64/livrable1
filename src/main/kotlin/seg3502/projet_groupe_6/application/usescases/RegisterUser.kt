package application.usecases

interface RegisterUser {
    fun executer(commande: RegisterUserCommand): UserRegisteredResponse
}

data class RegisterUserCommand(
    val userId: Long,
    val username: String,
    val email: String,
    val password: String
)

data class UserRegisteredResponse(
    val success: Boolean,
    val message: String
)
