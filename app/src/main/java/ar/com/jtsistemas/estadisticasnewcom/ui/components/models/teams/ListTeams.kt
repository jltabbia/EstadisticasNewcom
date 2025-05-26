package ar.com.jtsistemas.estadisticasnewcom.ui.components.models.teams

data class ListTeams(
    val id: Int,
    val nombre: String,
    val origen: String,
    val games_play: Int,
    val games_win: Int
)
