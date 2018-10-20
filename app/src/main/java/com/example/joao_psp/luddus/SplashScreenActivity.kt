package com.example.joao_psp.luddus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent





class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler()
        handler.postDelayed({ showMainLuddus() }, 2000)
    }

    private fun showMainLuddus() {
        val intent = Intent(
            this, MainLuddus::class.java
        )
        startActivity(intent)
        finish()
    }
}
