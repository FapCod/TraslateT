package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class AboutUsActivity : AppCompatActivity() {
    private var interstitial: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        initAds()
        val sharebtn = findViewById<Button>(R.id.sharebtn)
        sharebtn.setOnClickListener {
            sharedapp()
        }

    }
    //    publicidad
    override fun onPause() {
        super.onPause()
        showAds()
        initAds()
//        Toast.makeText(this,"Esta modo onPause",Toast.LENGTH_SHORT).show()
    }

    private fun initAds() {
        var adRequest = AdRequest.Builder().build()
        InterstitialAd.load(
            this,
            "ca-app-pub-3408207304248121/6541039189",
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    interstitial = interstitialAd
                }

                override fun onAdFailedToLoad(p0: LoadAdError) {
                    interstitial = null
                }
            })
    }

    private fun showAds() {
        if (interstitial==null){

        }else{
            interstitial?.show(this)
        }

    }

//    fin publicidad

    private fun sharedapp() {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,"Te invito a descargar esta aplicación para que te comuniques conmigo https://www.youtube.com/fapcod ")
            type = "text/plain"
            putExtra(Intent.EXTRA_TITLE,"Compartir Aplicación con tus amigos :)")
        }
        val sharedIntent = Intent.createChooser(intent,null)
        startActivity(sharedIntent)
    }
}