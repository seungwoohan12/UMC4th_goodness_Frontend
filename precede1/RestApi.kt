package com.example.precede1
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RestApi {
    @POST("api/mail/Send")
    fun sendemails(@Body mail: Mail): Call<Mail>

    @POST("api/mail/auth/check")
    fun sendchecks(@Body mail: MailCheck): Call<MailCheck>
}