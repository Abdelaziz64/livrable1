package application.usecases

interface AcceptStudent {
    fun executer(commande: AcceptStudentCommand): StudentAcceptedResponse
}

data class AcceptStudentCommand(
    val teamId: Long,
    val studentId: Long
)

data class StudentAcceptedResponse(
    val success: Boolean,
    val message: String
)
