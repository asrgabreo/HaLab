package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer, mediaPlayerNew;
    MediaPlayer createMedia(){
        mediaPlayerNew =MediaPlayer.create(this,R.raw.song);
        return mediaPlayerNew;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=createMedia();
        Button play=findViewById(R.id.play);
        Button pause=findViewById(R.id.pause);
        Button stop=findViewById(R.id.stop);
        Button forward=findViewById(R.id.forward);
        Button restart=findViewById(R.id.restart);
        Button backward=findViewById(R.id.rewind);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Playing Song",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Pausing Song",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Song Stopped",Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
                mediaPlayer= createMedia();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Song Reset",Toast.LENGTH_SHORT).show();
                mediaPlayer.reset();
                mediaPlayer=createMedia();
                mediaPlayer.start();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPos=mediaPlayer.getCurrentPosition();
                int duration=mediaPlayer.getDuration();
                if((currentPos+5000) <= duration)
                mediaPlayer.seekTo(currentPos+5000);
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPos=mediaPlayer.getCurrentPosition();
                if((currentPos-5000)>=0)
                    mediaPlayer.seekTo(currentPos-5000);
            }
        });
    }
}