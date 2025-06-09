package ar.com.jtsistemas.estadisticasnewcom.teams.data.network.response

import com.google.gson.annotations.SerializedName

data class TeamsResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("origen") val origen: String,
    @SerializedName("gamesplay") val gamesplay: Int,
    @SerializedName("gameswin") val gameswin: Int
)
