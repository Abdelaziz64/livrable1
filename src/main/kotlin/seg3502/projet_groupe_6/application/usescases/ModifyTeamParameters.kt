package application.usecases

interface ModifyTeamParameters {
    fun executer(commande: ModifyTeamCommand): TeamModifiedResponse
}

data class ModifyTeamCommand(
    val teamId: Long,
    val newParameters: TeamParameters
)

data class TeamParameters(
    val minMembers: Int,
    val maxMembers: Int,
    val deadline: String
)

data class TeamModifiedResponse(
    val success: Boolean,
    val message: String
)
