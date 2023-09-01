package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.precede1.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity_abc_3 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abc3)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        var befo_btn : Button = findViewById(R.id.button24)
        befo_btn.setOnClickListener{
            var intent = Intent(this, RegisterActivity_a_1::class.java)

            startActivity(intent)
        }

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.34.113.4:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val restApi : RestApi = retrofit.create(RestApi::class.java)

        val authBtn = findViewById<Button>(R.id.btn_certification)
        authBtn.setOnClickListener{
            var mailTxt = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            var mail = Mail(mailTxt)
            Log.d("E", mail.email.toString())
            val call : Call<Mail> = restApi.sendemails(mail)

            call.enqueue(object : Callback<Mail> {
                override fun onResponse(call: Call<Mail>, response: Response<Mail>) {
                    if (response.isSuccessful) {
                        Toast.makeText(this@RegisterActivity_abc_3,"성공적으로 메시지가 전송되었습니다.", Toast.LENGTH_SHORT).show()
                        if (response.code() == 409) {

                        }
                        else if (response.code() == 400) {

                        }
                        else {
                            val mDialogView = LayoutInflater.from(this@RegisterActivity_abc_3).inflate(R.layout.custom_certification, null)
                            val mBuilder = AlertDialog.Builder(this@RegisterActivity_abc_3)
                                .setView(mDialogView)
                                .setTitle("Login Form")
                            val mAlterDialog = mBuilder.show()

                            val okButton = mDialogView.findViewById<Button>(R.id.successButton)
                            okButton.setOnClickListener {
                                mAlterDialog.dismiss()
                            }
                        }
                    }
                    else {
                        Toast.makeText(this@RegisterActivity_abc_3, "실패했습니다", Toast.LENGTH_SHORT).show()
                        Log.d("E", response.code().toString())
                    }
                }
                override fun onFailure(call: Call<Mail>, t: Throwable) {
                    Toast.makeText(this@RegisterActivity_abc_3, "실패했습니다 onfailure", Toast.LENGTH_SHORT).show()
                }
            })
        }

        val check_btn = findViewById<Button>(R.id.check)
        check_btn.setOnClickListener{
            var mailTxt = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            var checkTxt = findViewById<EditText>(R.id.editNumber).text.toString()
            var mailCheck = MailCheck(mailTxt, checkTxt)
            val call : Call<MailCheck> = restApi.sendchecks(mailCheck)

            call.enqueue(object : Callback<MailCheck> {
                override fun onResponse(call: Call<MailCheck>, response: Response<MailCheck>) {
                    if (response.isSuccessful) {
                        if (response.code() == 409) {

                        } else if (response.code() == 400) {

                        } else {
                            Toast.makeText(this@RegisterActivity_abc_3, "성공!!!", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(this@RegisterActivity_abc_3, "실패했습니다", Toast.LENGTH_SHORT)
                            .show()
                        Log.d("E", response.code().toString())
                    }
                }

                override fun onFailure(call: Call<MailCheck>, t: Throwable) {
                    Toast.makeText(
                        this@RegisterActivity_abc_3,
                        "실패했습니다 onfailure",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
        }

        val stab_btn = findViewById<Button>(R.id.button23)
        stab_btn.setOnClickListener {
            // 인증 확인 조건문 필요
            val mailTxt = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            val name = intent.getStringExtra("name")
            val birth = intent.getStringExtra("birth")

            val newIntent = Intent(this, RegisterActivity_abc_4::class.java)
            newIntent.putExtra("name", name)
            newIntent.putExtra("birth", birth)
            newIntent.putExtra("email", mailTxt)
            startActivity(newIntent)
        }
    }
}