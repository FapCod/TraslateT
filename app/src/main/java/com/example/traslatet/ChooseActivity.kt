package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.traslatet.databinding.ActivityChooseBinding
import com.google.android.gms.ads.AdRequest

class ChooseActivity : AppCompatActivity() {
    private lateinit var binding:ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLoadAds()
    }
    //publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerChoose.loadAd(adRequest)
    }
    //end publicidad

    fun irOyente(view: View){
        val intent = Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
    fun irNoOyente(view: View){
        val intent = Intent(this,NoListenerActivity::class.java);
        startActivity(intent);
    }

}