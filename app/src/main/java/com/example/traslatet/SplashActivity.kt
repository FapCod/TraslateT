package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private lateinit var handler: Handler;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //code for splash
        handler = Handler();
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent);
            finish();
        },3000)
    }
}