package ar.com.jtsistemas.estadisticasnewcom.teams.data

import ar.com.jtsistemas.estadisticasnewcom.teams.data.network.TeamsService

class TeamsRepository {
    private val api = TeamsService()

    suspend fun leerTeams(): ArrayList<String>
    {
        return api.leerTeams()

    }
}