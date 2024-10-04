package application.usecases

interface SetUpParameters {
    fun executer(commande: SetUpParametersCommand): ParametersSetResponse
}

data class SetUpParametersCommand(
    val courseCode: String,
    val minMembers: Int,
    val maxMembers: Int,
    val deadline: String
)

data class ParametersSetResponse(
    val success: Boolean,
    val message: String
)
