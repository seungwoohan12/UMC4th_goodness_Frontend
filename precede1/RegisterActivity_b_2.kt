package com.example.precede1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.precede1.R

class RegisterActivity_b_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_c2)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        var befo_btn : Button = findViewById(R.id.button21)
        befo_btn.setOnClickListener{
            var intent = Intent(this, RegisterActivity_b_1::class.java)

            startActivity(intent)
        }


    }
}