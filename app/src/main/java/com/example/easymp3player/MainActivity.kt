package com.example.easymp3player

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = this.findViewById<ImageButton>(R.id.imageButton)
        val boton2 = this.findViewById<ImageButton>(R.id.imageButton2)
        val boton3 =this.findViewById<ImageButton>(R.id.imageButton3)

        val mp = MediaPlayer.create(applicationContext, R.raw.ace_combat_cero)
        val mp2 = MediaPlayer.create(applicationContext, R.raw.cod_mw2_helicopter_ride)
        val mp3 = MediaPlayer.create(applicationContext, R.raw.duke_nukem_total_meltdownmental_heavy_2)

        boton1.setOnClickListener {

            if (mp2.isPlaying) { mp2.pause() }
            if (mp3.isPlaying) { mp3.pause() }
            if (!mp.isPlaying)
            {
                mp.start()
            }
            else {
                mp.pause()
            }
        }

        boton2.setOnClickListener {
            if (mp.isPlaying) { mp.pause() }
            if (mp3.isPlaying) { mp3.pause() }
            if (!mp2.isPlaying)
            {
                mp2.start()
            }
            else {
                mp2.pause()
            }
        }

        boton3.setOnClickListener {
            if (mp.isPlaying) { mp.pause() }
            if (mp2.isPlaying) { mp2.pause() }
            if (!mp3.isPlaying)
            {
                mp3.start()
            }
            else {
                mp3.pause()
            }
        }

    }
}