package com.example.traslatet

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager

class SignLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_language)
        //pantalla principal
        val traslateWrite= findViewById<View>(R.id.noOyente);
        traslateWrite.setOnClickListener{
            hideKeyboard(traslateWrite);
        }
    }

    //Esconder teclado
    fun hideKeyboard(view:View){
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0);
    }
}