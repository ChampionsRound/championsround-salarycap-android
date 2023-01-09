package com.championsround.salarycap.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Athlete(
    val firstName: String
)

@JsonClass(generateAdapter = true)
data class GetAthletesResponse(
    val athletes: List<Athlete>
)

