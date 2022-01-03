package com.example.daniwebandroidnativecoil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import coil.Coil
import coil.ImageLoader
import coil.imageLoader
import coil.load
import coil.util.CoilUtils
import okhttp3.OkHttpClient
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            when(Random.nextInt(0, 3)){
                0 -> imageView.load(getString(R.string.rect))
                1 -> imageView.load(getString(R.string.triangle))
                2 -> imageView.load(getString(R.string.circle))
            }
        }
    }

}