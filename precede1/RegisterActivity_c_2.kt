package com.example.precede1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.precede1.R

class RegisterActivity_c_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_b2)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        var befo_btn : Button = findViewById(R.id.button7)
        befo_btn.setOnClickListener{
            var intent = Intent(this, RegisterActivity_c_1::class.java)

            startActivity(intent)
        }


    }
}