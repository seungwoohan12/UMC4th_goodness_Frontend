package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_organ = findViewById<Button>(R.id.btn_organ3)
        val btn_person = findViewById<Button>(R.id.btn_organ2)

        val radiogroup = findViewById<RadioGroup>(R.id.radiogroup)

        var type : Int = 1

        btn_person.setOnClickListener{

        }

        btn_organ.setOnClickListener{
            fun onClick(v: View?) {
                radiogroup.setVisibility(View.VISIBLE)
            }
            val radioGroupButtonChangeListener =
                RadioGroup.OnCheckedChangeListener { radiogroup, i ->
                    if (i == R.id.radioButton) {
                        type = 2
                    } else if (i == R.id.radioButton3) {
                        type = 3
                    }
                }
        }

        var stab_btn : Button = findViewById(R.id.button2)
        stab_btn.setOnClickListener {
            var intent = Intent(this, RegisterActivity_a_1::class.java)
            when (type) {
                1 -> intent = Intent(this, RegisterActivity_a_1::class.java)
                2 -> intent = Intent(this, RegisterActivity_b_1::class.java)
                3 -> intent = Intent(this, RegisterActivity_c_1::class.java)
            }

            startActivity(intent)

        }
    }
}