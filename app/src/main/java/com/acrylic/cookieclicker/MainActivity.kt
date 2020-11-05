package com.acrylic.cookieclicker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.acrylic.cookieclicker.credits.CreditsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.credits).setOnClickListener {
            val int = Intent(this,CreditsActivity::class.java)
            startActivity(int)
        }
    }
}