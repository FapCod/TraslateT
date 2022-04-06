package com.example.traslatet

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.core.widget.addTextChangedListener
import java.text.Normalizer
import java.util.*
import kotlin.collections.ArrayList

class TraslateVoiceActivity : AppCompatActivity() {
    private val REQ_CODE_SPEECH_INPUT = 100;
    //Edit tex

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traslate_voice)

        MyToolbar().show(this, "Ir a inicio", true);
        //pantalla principal
        val traslatevoice = findViewById<View>(R.id.traslatevoice);
        traslatevoice.setOnClickListener {
            hideKeyboard(traslatevoice);
        }
        //button
        val editText = findViewById<EditText>(R.id.editTextvoice)
        val button = findViewById<Button>(R.id.buttonvoice);
        button.setOnClickListener {
            iniciarEntradaVoz()
        }
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                //diferenciar quien ha sido
                if (editText.getTag() == null) {
                    //Modificado por el usuario
                    limpiar();
                    convertirALS();
                } else {
                    //Modificado por el programa
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })


    }

    //    new
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option1 -> {
                val intent = Intent(this, MainActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this, "Opcion 1", Toast.LENGTH_SHORT).show();
            }
            R.id.option2 -> {
                val intent = Intent(this, AlphabetActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
            }
            R.id.option3 -> {
                val intent = Intent(this, TraslateWriteActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this,"Opcion 3",Toast.LENGTH_SHORT).show();
            }

        }
        return super.onOptionsItemSelected(item)
    }
    //    end new

    //voz
    private fun iniciarEntradaVoz() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        );
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Dime lo que sea 🤖")
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT)
        } catch (e: Exception) {
            Toast.makeText(this, "Error:" + e, Toast.LENGTH_SHORT).show();
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            REQ_CODE_SPEECH_INPUT -> {
                if (resultCode == RESULT_OK && null != data) {
                    val editText = findViewById<TextView>(R.id.editTextvoice);
                    val resultado: ArrayList<String> =
                        data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS) as ArrayList<String>;
                    editText.setText(resultado.get(0))
                }
            }
        }
    }
    //end voz

    //traducir
    // Convertir LS
    private fun convertirALS() {
        val editText = findViewById<EditText>(R.id.editTextvoice);
        var nuevacadena = (editText.text).trim();
        var cadenaslimpia = Normalizer.normalize(nuevacadena, Normalizer.Form.NFD);
        var cadenasintildes = cadenaslimpia.replace(
            "[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]".toRegex(),
            ""
        );
        var cadenanueva = Normalizer.normalize(cadenasintildes, Normalizer.Form.NFC)
        var fila = findViewById<GridLayout>(R.id.contenedorvoice)
        for (c in cadenanueva) {
            println(c)
            if (c.lowercaseChar() == 'a') {
                createIA(fila)
            }
            if (c.lowercaseChar() == 'b') {
                createIB(fila)
            }
            if (c.lowercaseChar() == 'c') {
                createIC(fila)
            }
            if (c.lowercaseChar() == 'd') {
                createID(fila)
            }
            if (c.lowercaseChar() == 'e') {
                createIE(fila)
            }
            if (c.lowercaseChar() == 'f') {
                createIF(fila)
            }
            if (c.lowercaseChar() == 'g') {
                createIG(fila)
            }
            if (c.lowercaseChar() == 'h') {
                createIH(fila)
            }
            if (c.lowercaseChar() == 'i') {
                createII(fila)
            }
            if (c.lowercaseChar() == 'j') {
                createIJ(fila)
            }
            if (c.lowercaseChar() == 'k') {
                createIK(fila)
            }
            if (c.lowercaseChar() == 'l') {
                createIL(fila)
            }
            if (c.lowercaseChar() == 'm') {
                createIM(fila)
            }
            if (c.lowercaseChar() == 'n') {
                createIN(fila)
            }
            if (c.lowercaseChar() == 'ñ') {
                createINN(fila)
            }
            if (c.lowercaseChar() == 'o') {
                createIO(fila)
            }
            if (c.lowercaseChar() == 'p') {
                createIP(fila)
            }
            if (c.lowercaseChar() == 'q') {
                createIQ(fila)
            }
            if (c.lowercaseChar() == 'r') {
                createIR(fila)
            }
            if (c.lowercaseChar() == 's') {
                createIS(fila)
            }
            if (c.lowercaseChar() == 't') {
                createIT(fila)
            }
            if (c.lowercaseChar() == 'u') {
                createIU(fila)
            }
            if (c.lowercaseChar() == 'v') {
                createIV(fila)
            }
            if (c.lowercaseChar() == 'w') {
                createIW(fila)
            }
            if (c.lowercaseChar() == 'x') {
                createIX(fila)
            }
            if (c.lowercaseChar() == 'y') {
                createIY(fila)
            }
            if (c.lowercaseChar() == 'z') {
                createIZ(fila)
            }
            if (c == ' ') {
                createIEE(fila)
            }
//            Toast.makeText(this, "" + c, Toast.LENGTH_SHORT).show();
        }
    }
    //Fin convertir LS

    //Imagenes por letra

    private fun createIA(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.a)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIB(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.b)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIC(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.c)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createID(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.d)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIE(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.e)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIF(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.f)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIG(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.g)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIH(fila1: GridLayout) {
        val fila = fila1
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.h)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createII(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.i)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIJ(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.j)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIK(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.k)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIL(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.l)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIM(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.m)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIN(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.n)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createINN(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.nn)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIO(fila2: GridLayout) {
        val fila = fila2
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.o)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIP(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.p)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIQ(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.q)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIR(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.r)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIS(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.s)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIT(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.t)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIU(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.u)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIV(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.v)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIW(fila3: GridLayout) {
        val fila = fila3
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.w)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIX(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.x)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIY(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.y)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIZ(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.z)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    private fun createIEE(fila4: GridLayout) {
        val fila = fila4
        val imag = ImageView(this)
        imag.setImageResource(R.drawable.espacio)
        val ancho = 125
        val alto = 150
        fila.addView(imag, ancho, alto)
    }

    //Fin de imagenes por letra

    //empty grid
    private fun limpiar() {
        val fila1 = findViewById<GridLayout>(R.id.contenedorvoice)
        fila1.removeAllViews()
    }
    //fin empty grid

    //end traducir


    //Esconder teclado
    fun hideKeyboard(view: View) {
        val inputMethodManager =
            getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0);
    }


}