package application.usecases

interface AddMemberToTeam {
    fun executer(commande: AddMemberCommand): MemberAddedResponse
}

data class AddMemberCommand(
    val teamId: Long,
    val memberId: Long
)

data class MemberAddedResponse(
    val success: Boolean,
    val message: String
)
