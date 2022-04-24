package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.traslatet.databinding.ActivityChooseBinding
import com.example.traslatet.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.interstitial.InterstitialAd


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Toolbar
        MyToolbar().show(this, "Inicio", false);
        initLoadAds()

    }
//publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerPrincipal.loadAd(adRequest)
    }
//    end publicidad





    fun viewClicked(v: View) {
        when (v.getId()) {
            R.id.cardViewTraductorVoz -> {
                val intent = Intent(this, TraslateVoiceActivity::class.java);
                startActivity(intent);
            }
            R.id.cardViewAbecedario -> {
                val intent = Intent(this, AlphabetActivity::class.java);
                startActivity(intent);
            }
            R.id.cardViewTeclado -> {
                val intent = Intent(this, TraslateWriteActivity::class.java);
                startActivity(intent);
            }
            R.id.cardViewSobreNosotros -> {
                val intent = Intent(this, AboutUsActivity::class.java);
                startActivity(intent);
            }
            R.id.cardViewNumeros -> {
                val intent = Intent(this, NumbersActivity::class.java);
                startActivity(intent);
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option1 -> {
                Toast.makeText(this, "Estas en inicio", Toast.LENGTH_SHORT).show();
            }
            R.id.option2 -> {
                val intent = Intent(this, AlphabetActivity::class.java);
                startActivity(intent);
            }
            R.id.option3 -> {
                val intent = Intent(this, TraslateVoiceActivity::class.java);
                startActivity(intent);
            }

        }
        return super.onOptionsItemSelected(item)
    }


}
