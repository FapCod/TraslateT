package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NoListenerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_listener)
    }
    fun viewClicked(v: View) {
        when (v.getId()) {
            R.id.cardViewTecladoNoEscucha-> {

            }
            R.id.cardViewSobreNosotros-> {
                val intent = Intent(this,AboutUsActivity::class.java);
                startActivity(intent);
            }
        }
    }
}