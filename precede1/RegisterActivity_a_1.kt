package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity_a_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_a1)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }


        var stab_btn : Button = findViewById(R.id.button3)
        stab_btn.setOnClickListener {
            val name = findViewById<EditText>(R.id.editName).text.toString()
            val year = findViewById<EditText>(R.id.editYear).text.toString()
            val month = findViewById<EditText>(R.id.editMonth).text.toString()
            val day = findViewById<EditText>(R.id.editDay).text.toString()
            val birth = year + month + day

            var intent = Intent(this, RegisterActivity_abc_3::class.java)

            var bundle = Bundle()
            bundle.putString("name", name)
            bundle.putString("birth", birth)

            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}