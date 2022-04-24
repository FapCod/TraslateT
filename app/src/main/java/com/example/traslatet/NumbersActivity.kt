package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.traslatet.databinding.ActivityNumbersBinding
import com.google.android.gms.ads.AdRequest

class NumbersActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNumbersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumbersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MyToolbar().show(this, "Ir a inicio", true);
        initLoadAds()
    }

    //publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerNumero.loadAd(adRequest)
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
                val intent = Intent(this, AlphabetActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
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