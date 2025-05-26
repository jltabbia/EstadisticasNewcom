package ar.com.jtsistemas.estadisticasnewcom.ui.components.models.players

data class ListPlayers(
    val id: Int,
    val team: Int,
    val documento: String,
    val nombre: String,
    val edad: Int,
    val goalswin: Int,
    val goalslost: Int,
    val gamesplay: Int
)
