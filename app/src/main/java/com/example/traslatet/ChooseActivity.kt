package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
    }

    fun irOyente(view: View){
        val intent = Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
    fun irNoOyente(view: View){
        val intent = Intent(this,NoListenerActivity::class.java);
        startActivity(intent);
    }

}