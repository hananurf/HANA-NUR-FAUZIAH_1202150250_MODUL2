package com.example.hananurfauziah.hananurfauziah_1202150250_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void kepiting_padang(View view) { // Untuk pindah ke halaman detail menu
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
}
