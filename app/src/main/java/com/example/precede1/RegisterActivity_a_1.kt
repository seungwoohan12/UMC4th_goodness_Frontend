package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity_a_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_a1)

        var stab_btn : Button = findViewById(R.id.button3)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, RegisterActivity_a_2::class.java)

            startActivity(Intent)
        }
    }
}