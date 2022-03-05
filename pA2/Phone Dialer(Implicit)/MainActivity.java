package com.example.app2b;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText phoneNo;
    Button callBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNo = findViewById(R.id.number);
        callBtn = findViewById(R.id.dial);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = phoneNo.getText().toString();
                if (number.length()>0) {
                    Intent it = new Intent(Intent.ACTION_DIAL);
                    it.setData(Uri.parse("tel:" + number));
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), "Enter a number first", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}