package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView myList;
    String[] countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList=findViewById(R.id.list);
        countryList=getResources().getStringArray(R.array.country);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,countryList);
        myList.setAdapter(arrayAdapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"You have clicked : "+adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}