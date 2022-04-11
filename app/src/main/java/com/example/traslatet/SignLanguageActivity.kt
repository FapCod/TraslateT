package com.example.traslatet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class SignLanguageActivity : AppCompatActivity(),TextToSpeech.OnInitListener  {
    private var tts: TextToSpeech?= null
    var cadena = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_language)
        tts= TextToSpeech(this,this)
        //code
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM
        )
        var  fila= findViewById<GridLayout>(R.id.contenedorLS)
        val a = findViewById<ImageView>(R.id.a)
        val b = findViewById<ImageView>(R.id.b)
        val c = findViewById<ImageView>(R.id.c)
        val d = findViewById<ImageView>(R.id.d)
        val e = findViewById<ImageView>(R.id.e)
        val f = findViewById<ImageView>(R.id.f)
        val g = findViewById<ImageView>(R.id.g)
        val h = findViewById<ImageView>(R.id.h)
        val i = findViewById<ImageView>(R.id.i)
        val j = findViewById<ImageView>(R.id.j)
        val k = findViewById<ImageView>(R.id.k)
        val l = findViewById<ImageView>(R.id.l)
        val m = findViewById<ImageView>(R.id.m)
        val n = findViewById<ImageView>(R.id.n)
        val nn = findViewById<ImageView>(R.id.nn)
        val o = findViewById<ImageView>(R.id.o)
        val p = findViewById<ImageView>(R.id.p)
        val q = findViewById<ImageView>(R.id.q)
        val r = findViewById<ImageView>(R.id.r)
        val s = findViewById<ImageView>(R.id.s)
        val t = findViewById<ImageView>(R.id.t)
        val u = findViewById<ImageView>(R.id.u)
        val v = findViewById<ImageView>(R.id.v)
        val w = findViewById<ImageView>(R.id.w)
        val x = findViewById<ImageView>(R.id.x)
        val y = findViewById<ImageView>(R.id.y)
        val z = findViewById<ImageView>(R.id.z)
        val uno = findViewById<ImageView>(R.id.uno)
        val dos = findViewById<ImageView>(R.id.dos)
        val tres = findViewById<ImageView>(R.id.tres)
        val cuatro = findViewById<ImageView>(R.id.cuatro)
        val cinco = findViewById<ImageView>(R.id.cinco)
        val seis = findViewById<ImageView>(R.id.seis)
        val siete = findViewById<ImageView>(R.id.siete)
        val ocho = findViewById<ImageView>(R.id.ocho)
        val nueve = findViewById<ImageView>(R.id.nueve)
        val cero = findViewById<ImageView>(R.id.cero)


        uno.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            uno.startAnimation(slideup)
            cadena += uno.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.uno)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        dos.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            dos.startAnimation(slideup)
            cadena += dos.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.dos)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        tres.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            tres.startAnimation(slideup)
            cadena += tres.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.tres)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        cuatro.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            cuatro.startAnimation(slideup)
            cadena += cuatro.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.cuatro)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        cinco.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            cinco.startAnimation(slideup)
            cadena += cinco.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.cinco)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        seis.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            seis.startAnimation(slideup)
            cadena += seis.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.seis)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        siete.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            siete.startAnimation(slideup)
            cadena += siete.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.siete)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        ocho.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            ocho.startAnimation(slideup)
            cadena += ocho.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.ocho)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        nueve.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            nueve.startAnimation(slideup)
            cadena += nueve.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.nueve)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        cero.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            cero.startAnimation(slideup)
            cadena += cero.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.cero)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }

        a.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            a.startAnimation(slideup)
            cadena += a.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.a)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)


        }
        b.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            b.startAnimation(slideup)
            cadena += b.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.b)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        c.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            c.startAnimation(slideup)
            cadena += c.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.c)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        d.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            d.startAnimation(slideup)
            cadena += d.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.d)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        e.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            e.startAnimation(slideup)
            cadena += e.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.e)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        f.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            f.startAnimation(slideup)
            cadena += f.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.f)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        g.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            g.startAnimation(slideup)
            cadena += g.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.g)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        h.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            h.startAnimation(slideup)
            cadena += h.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.h)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        i.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            i.startAnimation(slideup)
            cadena += i.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.i)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        j.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            j.startAnimation(slideup)
            cadena += j.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.j)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        k.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            k.startAnimation(slideup)
            cadena += k.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.k)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        l.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            l.startAnimation(slideup)
            cadena += l.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.l)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        m.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            m.startAnimation(slideup)
            cadena += m.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.m)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        n.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            n.startAnimation(slideup)
            cadena += n.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.n)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        nn.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            nn.startAnimation(slideup)
            cadena += nn.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.nn)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        o.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            o.startAnimation(slideup)
            cadena += o.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.o)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        p.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            p.startAnimation(slideup)
            cadena += p.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.p)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        q.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            q.startAnimation(slideup)
            cadena += q.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.q)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        r.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            r.startAnimation(slideup)
            cadena += r.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.r)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        s.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            s.startAnimation(slideup)
            cadena += s.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.s)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        t.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            t.startAnimation(slideup)
            cadena += t.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.t)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        u.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            u.startAnimation(slideup)
            cadena += u.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.u)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        v.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            v.startAnimation(slideup)
            cadena += v.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.v)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        w.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            w.startAnimation(slideup)
            cadena += w.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.w)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        x.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            x.startAnimation(slideup)
            cadena += x.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.x)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        y.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            y.startAnimation(slideup)
            cadena += y.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.y)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }
        z.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            z.startAnimation(slideup)
            cadena += z.getTag().toString()
            val imag = ImageView(this)
            imag.setImageResource(R.drawable.z)
            val ancho = 125
            val alto = 150
            fila.addView(imag, ancho, alto)
        }

        //end code

    }
    //funciones
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
        tts!!.speak(text,TextToSpeech.QUEUE_FLUSH,null,"")
    }
    fun listening(view: View){
        if (cadena.isEmpty()){
//            Toast.makeText(this,"No hay nada que traducir", Toast.LENGTH_SHORT).show()
        }else{
            speakOut(cadena.toString())
            limpiar()

        }

//        Toast.makeText(this,cadena, Toast.LENGTH_SHORT).show();
        cadena=""
    }

    fun delete(view: View){
        if (cadena.length<=0){
//            Toast.makeText(this,"No hay nada para eliminar", Toast.LENGTH_SHORT).show();
        }else{
            val back= findViewById<Button>(R.id.back)
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
            back.startAnimation(slideup)
            val fila1= findViewById<GridLayout>(R.id.contenedorLS)
            fila1.removeViewAt(cadena.length-1)
            cadena = cadena.substring(0, cadena.length-1);
        }
//        Toast.makeText(this,cadena.length.toString(), Toast.LENGTH_SHORT).show();
    }
    private fun limpiar(){
        val fila1= findViewById<GridLayout>(R.id.contenedorLS)
        fila1.removeAllViews()
    }

    fun space(view: View){
        val fila= findViewById<GridLayout>(R.id.contenedorLS)
        val spacebar = findViewById<Button>(R.id.spacebar)
        val slideup = AnimationUtils.loadAnimation(applicationContext,
               R.anim.zoom_out)
        spacebar.startAnimation(slideup)
           cadena += spacebar.getTag().toString()
           val imag = ImageView(this)
            imag.setImageResource(R.drawable.espacio)
            val ancho = 125
           val alto = 150
           fila.addView(imag, ancho, alto)
    }
    //end funciones


}