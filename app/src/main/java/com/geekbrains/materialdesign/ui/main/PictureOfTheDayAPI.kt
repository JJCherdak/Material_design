package com.geekbrains.materialdesign.ui.main

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PictureOfTheDayAPI {
    @GET("planetary/apod")
    fun getPictureOfTheDay(@Query("api_key") apiKey: String): retrofit2.Call<PODServerResponseData>
}