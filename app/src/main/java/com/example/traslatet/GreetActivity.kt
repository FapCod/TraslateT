package com.example.traslatet

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import java.util.*

class GreetActivity : AppCompatActivity(),TextToSpeech.OnInitListener   {
    private var tts: TextToSpeech?= null
    var cadena = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
        tts= TextToSpeech(this,this)
        initLoadAds()
    }

    //publicidad
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        val banner = findViewById<AdView>(R.id.bannerGreet)
        banner.loadAd(adRequest)
    }
//    end publicidad

    //    inicio para que hable
    override fun onInit(status: Int) {
        if (status==TextToSpeech.SUCCESS){
            var result = tts!!.setLanguage(Locale.getDefault())
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Toast.makeText(this,"Lenguaje no soportado", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this,"Iniciacion fallida", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onDestroy() {
        if (tts != null){
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
    private fun speakOut(text:String){
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH,null,"")
    }
//fin de hablar

    fun viewClicked(v: View) {
        when (v.getId()) {
            R.id.cardViewBuenosDias-> {
                cadena="Buenos dias"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())

            }
            R.id.cardViewBuenasTardes-> {
                cadena="Buenas tardes"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewBuenasNoches-> {
                cadena="Buenas noches"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewDisculpa-> {
                cadena="Disculpa"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewGracias-> {
                cadena="Gracias"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewComoestas-> {
                cadena="Como estas?"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewComoteLLamas-> {
                cadena="Como te llamas?"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
            R.id.cardViewPorFavorMeAyudas-> {
                cadena="Por favor, ¿Me ayudas?"
                val vibrator: Vibrator
                vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
                speakOut(cadena.toString())
            }
        }
    }
}