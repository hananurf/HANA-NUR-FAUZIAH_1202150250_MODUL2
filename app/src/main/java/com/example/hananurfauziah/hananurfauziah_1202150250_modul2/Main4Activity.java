package com.example.hananurfauziah.hananurfauziah_1202150250_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toast.makeText(getApplicationContext(), "Dine In", Toast.LENGTH_LONG).show(); // Untuk menampilkan pesan Dine In saat pertama masuk halaman ini
    }

    public void pilih_pesan(View view) { // Untuk pindah ke halaman menu
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}
