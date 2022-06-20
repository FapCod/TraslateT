package com.example.traslatet

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.speech.tts.TextToSpeech
import android.text.method.KeyListener
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.cardview.widget.CardView
import java.text.Normalizer
import java.util.*

class TraslateWriteActivity : AppCompatActivity(),TextToSpeech.OnInitListener {
    private var tts: TextToSpeech?= null
    var cadena = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traslate_write)
        MyToolbar().show(this,"Ir a inicio",true);
        //pantalla principal
        val traslateWrite= findViewById<View>(R.id.traslateWrite);
        traslateWrite.setOnClickListener{
            hideKeyboard(traslateWrite);
        }
//        inicializando el tss
        tts= TextToSpeech(this,this)
        //button
        val button = findViewById<Button>(R.id.buttonwrite);
        button.setOnClickListener {
            val vibrator: Vibrator
            vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibrator.vibrate(10)
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_outbtn)
            button.startAnimation(slideup)
            limpiar();
            convertirALS();
            hideKeyboard(button);
        }
        animarBoton()
    }

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


    //Esconder teclado
    fun hideKeyboard(view:View){
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0);
    }

    //obtener evento cuando presionan el eliminar en teclado normal







    //Convertir LS
    private fun convertirALS() {
        val editText = findViewById<EditText>(R.id.editTextwrite);
        var nuevacadena = (editText.text).trim();
        var cadenaslimpia = Normalizer.normalize(nuevacadena, Normalizer.Form.NFD);
        var cadenasintildes =  cadenaslimpia.replace("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]".toRegex(), "");
        var cadenanueva = Normalizer.normalize(cadenasintildes, Normalizer.Form.NFC)
        var  fila= findViewById<GridLayout>(R.id.contenedor)
        for (c in cadenanueva) {
            println(c)
            if (c.lowercaseChar()=='a'){ createIA(fila) }
            if (c.lowercaseChar()=='b'){ createIB(fila) }
            if (c.lowercaseChar()=='c'){ createIC(fila) }
            if (c.lowercaseChar()=='d'){ createID(fila) }
            if (c.lowercaseChar()=='e'){ createIE(fila) }
            if (c.lowercaseChar()=='f'){ createIF(fila) }
            if (c.lowercaseChar()=='g'){ createIG(fila) }
            if (c.lowercaseChar()=='h'){ createIH(fila) }
            if (c.lowercaseChar()=='i'){ createII(fila) }
            if (c.lowercaseChar()=='j'){ createIJ(fila) }
            if (c.lowercaseChar()=='k'){ createIK(fila) }
            if (c.lowercaseChar()=='l'){ createIL(fila) }
            if (c.lowercaseChar()=='m'){ createIM(fila) }
            if (c.lowercaseChar()=='n'){ createIN(fila) }
            if (c.lowercaseChar()=='ñ'){ createINN(fila) }
            if (c.lowercaseChar()=='o'){ createIO(fila) }
            if (c.lowercaseChar()=='p'){ createIP(fila) }
            if (c.lowercaseChar()=='q'){ createIQ(fila) }
            if (c.lowercaseChar()=='r'){ createIR(fila) }
            if (c.lowercaseChar()=='s'){ createIS(fila) }
            if (c.lowercaseChar()=='t'){ createIT(fila) }
            if (c.lowercaseChar()=='u'){ createIU(fila) }
            if (c.lowercaseChar()=='v'){ createIV(fila) }
            if (c.lowercaseChar()=='w'){ createIW(fila) }
            if (c.lowercaseChar()=='x'){ createIX(fila) }
            if (c.lowercaseChar()=='y'){ createIY(fila) }
            if (c.lowercaseChar()=='z'){ createIZ(fila) }
            if (c.lowercaseChar() == '0') {
                createI0(fila)
            }
            if (c.lowercaseChar() == '1') {
                createI1(fila)
            }
            if (c.lowercaseChar() == '2') {
                createI2(fila)
            }
            if (c.lowercaseChar() == '3') {
                createI3(fila)
            }
            if (c.lowercaseChar() == '4') {
                createI4(fila)
            }
            if (c.lowercaseChar() == '5') {
                createI5(fila)
            }
            if (c.lowercaseChar() == '6') {
                createI6(fila)
            }
            if (c.lowercaseChar() == '7') {
                createI7(fila)
            }
            if (c.lowercaseChar() == '8') {
                createI8(fila)
            }
            if (c.lowercaseChar() == '9') {
                createI9(fila)
            }
            if(c==' '){ createIEE(fila) }
//            Toast.makeText(this, "" + c, Toast.LENGTH_SHORT).show();
        }
    }
    //Fin convertir LS

    //Imagenes por letra

    private fun createIA(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.a)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIB(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.b)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIC(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.c)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createID(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.d)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIE(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.e)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIF(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.f)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIG(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.g)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIH(fila1: GridLayout) {
        val fila= fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.h)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createII(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.i)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIJ(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.j)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIK(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.k)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIL(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.l)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIM(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.m)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIN(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.n)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createINN(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.nn)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIO(fila2: GridLayout) {
        val fila= fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.o)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIP(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.p)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIQ(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.q)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIR(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.r)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIS(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.s)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIT(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.t)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIU(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.u)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIV(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.v)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIW(fila3: GridLayout) {
        val fila= fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.w)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIX(fila4: GridLayout) {
        val fila= fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.x)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIY(fila4: GridLayout) {
        val fila= fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.y)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createIZ(fila4: GridLayout) {
        val fila= fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.z)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }
    private fun createI1(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.uno)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI2(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.dos)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI3(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.tres)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI4(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.cuatro)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI5(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.cinco)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI6(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.seis)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI7(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.siete)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI8(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.ocho)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI9(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.nueve)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }
    private fun createI0(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.cero)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIEE(fila4: GridLayout) {
        val fila= fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.espacio)
        val ancho = 125
        val alto = 150
        fila.addView(imag,ancho,alto)
    }

    //Fin de imagenes por letra

    //empty grid
    private fun limpiar(){
        val fila1= findViewById<GridLayout>(R.id.contenedor)
        fila1.removeAllViews()
    }
    //fin empty grid

//    funciones para escuchar audio
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
        val editText = findViewById<EditText>(R.id.editTextwrite);
        var nuevacadena = (editText.text).trim();
        if (nuevacadena.isEmpty()){
            Toast.makeText(this,"No hay nada que decir", Toast.LENGTH_SHORT).show()
        }else{
            speakOut(nuevacadena.toString())
            limpiar()

        }

//        Toast.makeText(this,cadena, Toast.LENGTH_SHORT).show();
        cadena=""
    }
    private fun animarBoton(){
        val vibrator:Vibrator
        vibrator = getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        val escuchar = findViewById<Button>(R.id.buttonlistener)
        escuchar.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_outbtn)
            escuchar.startAnimation(slideup)
            vibrator.vibrate(10)
            listening(escuchar)
        }
    }

}