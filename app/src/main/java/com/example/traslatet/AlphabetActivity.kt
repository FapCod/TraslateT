package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.traslatet.databinding.ActivityAlphabetBinding
import com.google.android.gms.ads.AdRequest

class AlphabetActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAlphabetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlphabetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyToolbar().show(this, "Ir a inicio", true);
        initLoadAds()
    }

    //publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerAbecedario.loadAd(adRequest)
    }
//    end publicidad

    //    new
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option1 -> {
                val intent = Intent(this,MainActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this, "Opcion 1", Toast.LENGTH_SHORT).show();
            }
            R.id.option2 -> {
                Toast.makeText(this,"Estas en Abecedario",Toast.LENGTH_SHORT).show();
            }
            R.id.option3 -> {
                val intent = Intent(this, TraslateVoiceActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this,"Opcion 3",Toast.LENGTH_SHORT).show();
            }

        }
        return super.onOptionsItemSelected(item)
    }


//    end new


}