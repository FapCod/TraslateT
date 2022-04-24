package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.traslatet.databinding.ActivityMainBinding
import com.example.traslatet.databinding.ActivityNoListenerBinding
import com.google.android.gms.ads.AdRequest

class NoListenerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoListenerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoListenerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MyToolbar().show(this, "Inicio", false);
        initLoadAds()
    }

    //publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerNoOyente.loadAd(adRequest)
    }
//    end publicidad



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