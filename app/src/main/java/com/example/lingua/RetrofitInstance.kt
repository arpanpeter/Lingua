package com.example.lingua

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
const val BASE_URL="https://api.dictionaryapi.dev/api/v2/entries/"
    private fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val dictionaryApi:DictionaryApi= getInstance().create(DictionaryApi::class.java)
}