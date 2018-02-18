package com.example.hananurfauziah.hananurfauziah_1202150250_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    final Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
            @Override
            public void run () { // agar bisa langsung menghubungkan ke halaman selanjutnya
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                finish();
            }
        }, 3000L); // Tunggu selama 3 detik untuk pindah ke halaman berikutnya
    }
}