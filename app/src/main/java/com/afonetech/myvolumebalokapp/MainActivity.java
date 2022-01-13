package com.afonetech.myvolumebalokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPanjang, etLebar, etTinggi;
    Button btn_Hitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btn_Hitung = findViewById(R.id.btn_Hitung);
        tvHasil = findViewById(R.id.tvHasil);

        btn_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etPanjang.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Panjangnya Masih Kosong!!", Toast.LENGTH_SHORT).show();
                }else if(etLebar.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Lebarnya Masih Kosong!!", Toast.LENGTH_SHORT).show();
                }else if(etTinggi.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Tingginya Masih Kosong!!", Toast.LENGTH_SHORT).show();
                }else {
                    int Panjang = Integer.valueOf(etPanjang.getText().toString());
                    int Lebar = Integer.valueOf(etLebar.getText().toString());
                    int Tinggi = Integer.valueOf(etTinggi.getText().toString());

                    int Hasil = Panjang * Lebar *Tinggi;
                    tvHasil.setText(String.valueOf(Hasil));
                }
            }
        });
    }
}