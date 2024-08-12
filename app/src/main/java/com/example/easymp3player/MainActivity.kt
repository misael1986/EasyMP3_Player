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
    //    val boton4=findViewById<ImageButton>(R.id.boton2)
    //    val boton5=findViewById<ImageButton>(R.id.boton1)

        val mp = MediaPlayer.create(applicationContext, R.raw.ace_combat_cero)
        val mp2 = MediaPlayer.create(applicationContext, R.raw.cod_mw2_helicopter_ride)
        val mp3 = MediaPlayer.create(applicationContext, R.raw.duke_nukem_total_meltdownmental_heavy_2)

        boton1.setOnClickListener {
            // https://stackoverflow.com/questions/28613751/how-to-register-new-file-type-association-with-mp3
            if (mp2.isPlaying) { mp2.stop() }
            if (mp3.isPlaying) { mp3.stop() }
            if (!mp.isPlaying)
            {
                mp.start()
            }
            else {
                mp.pause()
                //mp.prepare()
            }
        }

        boton2.setOnClickListener {
            if (mp.isPlaying) { mp.stop() }
            if (mp3.isPlaying) { mp3.stop() }
            if (!mp2.isPlaying)
            {
                mp2.start()
            }
            else {
                mp2.pause()
                //mp2.prepare()
            }
        }

        boton3.setOnClickListener {
            if (mp.isPlaying) { mp.stop() }
            if (mp2.isPlaying) { mp2.stop() }
            if (!mp3.isPlaying)
            {
                mp3.start()
            }
            else {
                mp3.pause()
                //mp3.prepare()
            }
        }

    }
}