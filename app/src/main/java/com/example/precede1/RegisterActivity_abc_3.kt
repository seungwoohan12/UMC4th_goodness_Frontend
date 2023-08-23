package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity_abc_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abc3)

        val auth_btn = findViewById<Button>(R.id.button4)
        auth_btn.setOnClickListener({
            val retrofit = Retrofit.Builder()
                .baseUrl("http://3.34.113.4:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val restApi : RestApi = retrofit.create(RestApi::class.java)

            val call : Call<Mail> = restApi.getposts()
            call.enqueue(object : Callback<Mail> {
                override fun onResponse(call: Call<Mail>, response: Response<Mail>) {
                    if (response.isSuccessful) {
                        if (response.code() == 409) {

                        }
                        else if (response.code() == 400) {

                        }
                        else {

                        }
                    }
                }
                override fun onFailure(call: Call<Mail>, t: Throwable) {

                }
            })
        })

        val check_btn = findViewById<Button>(R.id.button6)

        val stab_btn : Button = findViewById(R.id.button3)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, RegisterActivity_abc_4::class.java)

            startActivity(Intent)
        }
    }
}