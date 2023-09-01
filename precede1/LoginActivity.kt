package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var stab_btn : Button = findViewById(R.id.btn_use3)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, UseActivity::class.java)

            startActivity(Intent)
        }
        var sta_btn : Button = findViewById(R.id.btn_finder)
        sta_btn.setOnClickListener {
            var Intent = Intent(this, IDPWActivity::class.java)

            startActivity(Intent)
        }
        var muse_btn : Button = findViewById(R.id.btn_firstWatch)
        muse_btn.setOnClickListener {
            var Intent = Intent(this, HomeActivity::class.java)

            startActivity(Intent)
        }
        var mpriv_btn : Button = findViewById(R.id.btn_use)
        mpriv_btn.setOnClickListener {
            var Intent = Intent(this, UseActivity::class.java)

            startActivity(Intent)
        }
        var mpol_btn : Button = findViewById(R.id.btn_policy)
        mpol_btn.setOnClickListener {
            var Intent = Intent(this, MainprivActivity::class.java)

            startActivity(Intent)
        }
    }
}