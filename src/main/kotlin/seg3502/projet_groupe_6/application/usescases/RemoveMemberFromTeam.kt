package application.usecases

interface RemoveMemberFromTeam {
    fun executer(commande: RemoveMemberCommand): MemberRemovedResponse
}

data class RemoveMemberCommand(
    val teamId: Long,
    val memberId: Long
)

data class MemberRemovedResponse(
    val success: Boolean,
    val message: String
)
