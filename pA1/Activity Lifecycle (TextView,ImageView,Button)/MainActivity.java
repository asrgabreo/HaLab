package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.imageView);
        Button button1 = findViewById(R.id.button);
        final boolean[] ch = {false};
        img.setImageResource(R.drawable.ic_launcher_foreground);
        Toast.makeText(getApplicationContext(), "OnCreate was called", Toast.LENGTH_SHORT).show();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch[0] ==false){
                    img.setImageResource(R.drawable.ic_launcher_background);
                    ch[0] =true;
                }else{
                    img.setImageResource(R.drawable.ic_launcher_foreground);
                    ch[0] =false;
                }
            }
        });
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart was called", Toast.LENGTH_SHORT).show();
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart was called", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop was called", Toast.LENGTH_SHORT).show();

    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume was called", Toast.LENGTH_SHORT).show();

    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause was called", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy was called", Toast.LENGTH_SHORT).show();
    }
}