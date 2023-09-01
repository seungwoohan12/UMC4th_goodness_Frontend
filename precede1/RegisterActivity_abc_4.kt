package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity_abc_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abc4)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        var befo_btn : Button = findViewById(R.id.button26)
        befo_btn.setOnClickListener{
            var intent = Intent(this, RegisterActivity_abc_3::class.java)

            startActivity(intent)
        }


        var stab_btn : Button = findViewById(R.id.button26)
        stab_btn.setOnClickListener {
            var newIntent = Intent(this, HomeActivity::class.java)

            startActivity(newIntent)
        }
    }
}