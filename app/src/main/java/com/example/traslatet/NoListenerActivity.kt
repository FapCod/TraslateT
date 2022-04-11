package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class NoListenerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_listener)
        MyToolbar().show(this, "Inicio", false);
    }
    fun viewClicked(v: View) {
        when (v.getId()) {
            R.id.cardViewTecladoNoEscucha-> {
                val intent = Intent(this,SignLanguageActivity::class.java);
                startActivity(intent);
            }
            R.id.cardViewSobreNosotros-> {
                val intent = Intent(this,AboutUsActivity::class.java);
                startActivity(intent);
            }
        }
    }




}