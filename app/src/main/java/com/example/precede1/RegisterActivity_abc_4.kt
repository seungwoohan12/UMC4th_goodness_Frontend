package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity_abc_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abc4)

        var stab_btn : Button = findViewById(R.id.button3)
        stab_btn.setOnClickListener {
                var Intent = Intent(this, HomeActivity::class.java)

            startActivity(Intent)
        }
    }
}