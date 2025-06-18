package com.example.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout countriesLayout = findViewById(R.id.countries_layout);
        LinearLayout leadersLayout = findViewById(R.id.leaders_layout);
        LinearLayout museumsLayout = findViewById(R.id.museums_layout);
        LinearLayout wondersLayout = findViewById(R.id.wonders_layout);

        countriesLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CountriesActivity.class);
            startActivity(intent);
        });

        leadersLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LeadersActivity.class);
            startActivity(intent);
        });

        museumsLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MuseumsActivity.class);
            startActivity(intent);
        });

        wondersLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WondersActivity.class);
            startActivity(intent);
        });
    }
}