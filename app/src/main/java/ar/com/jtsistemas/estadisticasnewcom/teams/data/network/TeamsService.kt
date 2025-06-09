package ar.com.jtsistemas.estadisticasnewcom.teams.data.network

import ar.com.jtsistemas.estadisticasnewcom.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TeamsService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun leerTeams() {
        withContext(Dispatchers.IO)
        {
            val response = retrofit.create(TeamsCliente::class.java).leerTeams()
        }
    }
}