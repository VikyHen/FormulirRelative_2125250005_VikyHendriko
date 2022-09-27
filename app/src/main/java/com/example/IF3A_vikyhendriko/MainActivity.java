package com.example.IF3A_vikyhendriko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etNama, etNpm;
    private RadioGroup rgJk;
    private RadioButton rbJk;
    private Spinner spProdi;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNpm = findViewById(R.id.et_npm);
        etNama = findViewById(R.id.et_nama);
        rgJk = findViewById(R.id.rg_jk);
        spProdi = findViewById(R.id.sp_prodi);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String npm, nama, jk, prodi;
                int SelectedID;

                npm = etNpm.getText().toString();
                nama = etNama.getText().toString();
                prodi = spProdi.getSelectedItem().toString();

                //radio group dan radio button
                SelectedID = rgJk.getCheckedRadioButtonId();
                rbJk = findViewById(SelectedID);
                jk = rbJk.getText().toString();

                //cek edit text npm dan nama kosong
                if(npm.trim().equals(""))
                {
                    etNpm.setError("NPM tidak boleh kosong");
                }
                if (nama.trim().equals(""))
                {
                    etNama.setError("Nama tidak boleh kosong");
                }

                //panggil intent, kirim data ke ResultActivity
                Intent intent = new Intent(MainActivity.this, resultActivity.class);
                intent.putExtra("varNPM", npm);
                intent.putExtra("varNama", nama);
                intent.putExtra("varJk", jk);
                intent.putExtra("varProdi", prodi);
                startActivity(intent);
            }
        });
    }
}