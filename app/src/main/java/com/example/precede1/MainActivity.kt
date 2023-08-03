package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stab_btn : Button = findViewById(R.id.btn_organ)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, LoginActivity::class.java)

            startActivity(Intent)
        }
    }
}