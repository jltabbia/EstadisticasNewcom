package ar.com.jtsistemas.estadisticasnewcom.teams.domain

import android.R
import ar.com.jtsistemas.estadisticasnewcom.teams.data.TeamsRepository

class TeamsUseCase {
    private val repository = TeamsRepository()

    suspend operator fun invoke(): ArrayList<String> {
        return repository.leerTeams()
    }
}