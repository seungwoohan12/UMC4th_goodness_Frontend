package com.example.precede1

<<<<<<< HEAD
import android.os.Bundle
=======
import android.content.Intent
import android.os.Bundle
import android.widget.Button
>>>>>>> fee1a72 (Second commit)
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
    }
=======

        var stab_btn : Button = findViewById(R.id.btn_organ)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, LoginActivity::class.java)

            startActivity(Intent)
        }
}
>>>>>>> fee1a72 (Second commit)
}