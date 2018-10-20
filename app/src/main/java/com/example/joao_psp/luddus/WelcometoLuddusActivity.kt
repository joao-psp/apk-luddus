package com.example.joao_psp.luddus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcometo_luddus.*

class WelcometoLuddusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcometo_luddus)

        btn_wel_yes.setOnClickListener {
            val intent = Intent(
                this, MainLuddusActivity::class.java
            )
            startActivity(intent)
            finish()
        }
    }
}
