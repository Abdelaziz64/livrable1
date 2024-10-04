package application.usecases

interface CreateTeam {
    fun executer(commande: CreateTeamCommand): TeamCreatedResponse
}

data class CreateTeamCommand(
    val teamName: String,
    val creatorId: Long,
    val members: List<Long>
)

data class TeamCreatedResponse(
    val teamId: Long,
    val teamName: String,
    val members: List<Long>
)
