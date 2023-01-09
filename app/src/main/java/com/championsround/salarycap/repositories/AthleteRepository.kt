package com.championsround.salarycap.repositories

import com.championsround.salarycap.models.Athlete
import com.championsround.salarycap.services.AthleteService
import retrofit2.awaitResponse
import javax.inject.Inject

class AthleteRepository @Inject constructor(
    private val athleteService: AthleteService
) {
    suspend fun getAthletes(): List<Athlete> {
        val response = athleteService.getAthletes().awaitResponse()

        return response.body()?.athletes ?: emptyList()
    }
}