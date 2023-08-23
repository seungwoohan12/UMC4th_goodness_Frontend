package com.example.precede1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stab_btn : Button = findViewById(R.id.btn_organ)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, LoginActivity::class.java)

            startActivity(Intent)
        }
        var sta_btn : Button = findViewById(R.id.btn_individual)
        sta_btn.setOnClickListener {
            var Intent = Intent(this, LoginActivity::class.java)

            startActivity(Intent)
        }
        var muse_btn : Button = findViewById(R.id.btn_use)
        muse_btn.setOnClickListener {
            var Intent = Intent(this, MainuseActivity::class.java)

            startActivity(Intent)
        }
        var mpriv_btn : Button = findViewById(R.id.btn_policy)
        mpriv_btn.setOnClickListener {
            var Intent = Intent(this, MainprivActivity::class.java)

            startActivity(Intent)
        }
        var mpol_btn : Button = findViewById(R.id.btn_use4)
        mpol_btn.setOnClickListener {
            var Intent = Intent(this, RegisterActivity::class.java)

            startActivity(Intent)
        }
        var reg_btn : Button = findViewById(R.id.btn_policy2)
        reg_btn.setOnClickListener {
            var Intent = Intent(this, IDPWActivity::class.java)

            startActivity(Intent)
        }
}

}