package ar.com.jtsistemas.estadisticasnewcom.teams.data.network

import ar.com.jtsistemas.estadisticasnewcom.LEE_TEAMS
import ar.com.jtsistemas.estadisticasnewcom.teams.data.network.response.TeamsResponse
import okhttp3.Response
import retrofit2.http.GET

interface TeamsCliente {
    @GET(LEE_TEAMS)
    suspend fun leerTeams():Response<TeamsResponse>
}