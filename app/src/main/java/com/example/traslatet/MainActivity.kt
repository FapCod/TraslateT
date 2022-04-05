package com.example.traslatet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toolbar
        MyToolbar().show(this,"Inicio",false);

    }
   fun viewClicked(v:View) {
       when (v.getId()) {
           R.id.cardViewTraductorVoz-> {
               val intent = Intent(this,TraslateVoiceActivity::class.java);
               startActivity(intent);
           }
           R.id.cardViewAbecedario-> {
               val intent = Intent(this,AlphabetActivity::class.java);
               startActivity(intent);
           }
           R.id.cardViewTeclado-> {
               val intent = Intent(this,TraslateWriteActivity::class.java);
               startActivity(intent);
           }
           R.id.cardViewSobreNosotros-> {
               Toast.makeText(this,"Sobre Nosotros",Toast.LENGTH_SHORT).show();
           }


       }
   }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
                menuInflater.inflate(R.menu.menu_contextual,menu);
                return super.onCreateOptionsMenu(menu)
            }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1 ->{
                        Toast.makeText(this,"Estas en inicio",Toast.LENGTH_SHORT).show();
                    }
            R.id.option2 ->{
                        val intent= Intent(this,AlphabetActivity::class.java);
                        startActivity(intent);
//                Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
                    }
            R.id.option3 ->{
                        val intent= Intent(this,TraslateWriteActivity::class.java);
                        startActivity(intent);
//                Toast.makeText(this,"Opcion 3",Toast.LENGTH_SHORT).show();
                    }

                }
                return super.onOptionsItemSelected(item)
            }



        }
