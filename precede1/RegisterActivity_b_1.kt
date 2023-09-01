package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.precede1.R

class RegisterActivity_b_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_b1)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}