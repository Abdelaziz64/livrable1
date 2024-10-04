package application.usecases

interface UpdateParameters {
    fun executer(commande: UpdateParametersCommand): ParametersUpdatedResponse
}

data class UpdateParametersCommand(
    val courseCode: String,
    val newMinMembers: Int,
    val newMaxMembers: Int,
    val newDeadline: String
)

data class ParametersUpdatedResponse(
    val success: Boolean,
    val message: String
)
