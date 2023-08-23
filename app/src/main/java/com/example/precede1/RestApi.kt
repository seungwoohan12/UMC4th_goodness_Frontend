package com.example.precede1
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface RestApi {
    @POST("api/mail/send")
    fun getposts(): Call<Mail>
}