package com.example.responsi270

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Username = findViewById<EditText>(R.id.username)
        val Password = findViewById<EditText>(R.id.password)

        val button = findViewById<Button>(R.id.button)

            .setOnClickListener {
                var Username = username.text.toString()
                var Password = password.text.toString()

                intent = Intent(this@MainActivity, ActivityKedua::class.java)
                intent.putExtra("username", Username)
                intent.putExtra("Password", Password)

                if (username.equals("fitri")&&password.equals("270")){
                    Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Pssword tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                }
                startActivity(intent)
            }
    }
}