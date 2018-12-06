package com.example.rafael.castrorafaelpe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View v){
        Toast.makeText(this, "Data Saved", Toast.LENGTH_LONG).show();
    }

    public void search(View v){
        Toast.makeText(this, "Searching..", Toast.LENGTH_LONG).show();
    }
}
