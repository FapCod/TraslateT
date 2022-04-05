package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList

class TraslateVoiceActivity : AppCompatActivity() {
    private val REQ_CODE_SPEECH_INPUT =100;
    //Edit tex

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traslate_voice)

        MyToolbar().show(this,"Ir a inicio",true);
        //button
        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener {
            iniciarEntradaVoz()
        }


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
                val intent = Intent(this, TraslateWriteActivity::class.java);
                startActivity(intent);
//                Toast.makeText(this,"Opcion 3",Toast.LENGTH_SHORT).show();
            }

        }
        return super.onOptionsItemSelected(item)
    }
    //    end new

    private fun iniciarEntradaVoz(){
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Dime lo que sea 🤖")
        try {
                startActivityForResult(intent,REQ_CODE_SPEECH_INPUT)
        }catch (e:Exception){
            Toast.makeText(this,"Error:"+e,Toast.LENGTH_SHORT).show();
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            REQ_CODE_SPEECH_INPUT->{
                if (resultCode== RESULT_OK && null != data){
                    val editText = findViewById<TextView>(R.id.editText);
                    val resultado:ArrayList<String> =
                        data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS) as ArrayList<String>;
                    editText.setText(resultado.get(0))
                }
            }
        }
    }
}