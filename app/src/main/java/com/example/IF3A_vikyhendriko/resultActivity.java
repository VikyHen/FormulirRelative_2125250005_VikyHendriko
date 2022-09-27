package com.example.IF3A_vikyhendriko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    private TextView tvNpm, tvNama, tvJk, tvProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNpm = findViewById(R.id.tv_npm);
        tvNama = findViewById(R.id.tv_nama);
        tvJk = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);

        //tangkap intent dari MainActivity
        Intent intent = getIntent();
        tvNpm.setText(intent.getStringExtra("varNpm"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvProdi.setText(intent.getStringExtra("varProdi"));
        tvJk.setText(intent.getStringExtra("varJk"));
    }
}