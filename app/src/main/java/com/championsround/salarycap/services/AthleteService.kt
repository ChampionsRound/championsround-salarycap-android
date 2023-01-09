package com.championsround.salarycap.services

import com.championsround.salarycap.models.GetAthletesResponse
import retrofit2.Call
import retrofit2.http.GET

interface AthleteService {
    @GET("/ChampionsRound/technical-interview/master/athletes.json")
    fun getAthletes(): Call<GetAthletesResponse>
}