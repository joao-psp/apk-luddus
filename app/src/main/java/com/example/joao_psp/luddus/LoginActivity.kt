package com.example.joao_psp.luddus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_luddus.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_luddus)

        btn_login.setOnClickListener {
            val intent = Intent(
                this, WelcometoLuddusActivity::class.java
            )
            startActivity(intent)
            finish()
        }
    }
}
