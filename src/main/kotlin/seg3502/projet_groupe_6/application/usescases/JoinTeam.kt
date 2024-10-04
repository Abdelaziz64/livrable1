package application.usecases

interface JoinTeam {
    fun executer(commande: JoinTeamCommand): TeamJoinedResponse
}

data class JoinTeamCommand(
    val teamId: Long,
    val studentId: Long
)

data class TeamJoinedResponse(
    val success: Boolean,
    val message: String
)
