package com.example.meu_play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
class MainActivity : AppCompatActivity() {

    private var mediaPlayer:MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this,R.raw.WishYoudComeTrue)

        btn_play.setOnClickListener(mediaPlayer?.start())
        btn_pause.setOnClickListener(mediaPlayer?.pause())
        btn_stop.setOnClickListener(mediaPlayer?.stop())
    }
}