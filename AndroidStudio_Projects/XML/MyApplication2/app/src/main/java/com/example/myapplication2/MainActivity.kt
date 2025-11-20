package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    lateinit var loginBtn: Button
    //lateinit var etCorreo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //setContentView(): carga el XML y lo “pega” a esa pantalla.
        // Sin esta línea no se puede acceder a los elementos del layout.

        loginBtn = findViewById(R.id.loginBtn)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("tal","cual")
    }


    override fun onStart(){
        super.onStart()
        Log.e("s","start")

        loginBtn.setOnClickListener {
            Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();

            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.v("r", "resume")
    }

    override fun onPause() {//primero al cambiar de pantalla luego onstop, cuando gira la pantalla tb
        super.onPause()
        Log.d("p", "pause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("sp", "stop")
    }

    override fun onDestroy() { //este no se llama siempre, de hecho se intenta no usar, no es muy fiable porque a veces no se controla cuando android lo hace
        super.onDestroy()
        Log.v("d", "destroy")
    }


}