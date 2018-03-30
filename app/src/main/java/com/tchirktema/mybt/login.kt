package com.tchirktema.mybt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    public fun loginMe(view: View){
        val loginIntent = Intent(this, MenuPrincipal::class.java)
        startActivity(loginIntent)
    }
}
