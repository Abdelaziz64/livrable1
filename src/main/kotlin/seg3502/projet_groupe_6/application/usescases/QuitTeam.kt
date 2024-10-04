package application.usecases

interface QuitTeam {
    fun executer(commande: QuitTeamCommand): TeamQuitResponse
}

data class QuitTeamCommand(
    val teamId: Long,
    val memberId: Long
)

data class TeamQuitResponse(
    val success: Boolean,
    val message: String
)
