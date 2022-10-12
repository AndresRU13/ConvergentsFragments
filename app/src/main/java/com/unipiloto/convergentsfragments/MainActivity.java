package com.unipiloto.convergentsfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void details(View view) {
        Intent in = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(in);
    }
}