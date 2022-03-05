package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AdditionResult extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_result);

        answer = findViewById(R.id.result);

        Bundle bund = getIntent().getExtras();
        String summ = bund.getString("Result");
        answer.setText(summ);

    }
}