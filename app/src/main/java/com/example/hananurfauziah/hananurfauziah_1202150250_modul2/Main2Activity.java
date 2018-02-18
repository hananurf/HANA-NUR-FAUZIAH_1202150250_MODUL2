package com.example.hananurfauziah.hananurfauziah_1202150250_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getApplicationContext(), "Hana Nur Fauziah_1202150250", Toast.LENGTH_LONG).show(); // Menampilkan pesan saat pertama kali masuk ke halaman ini
    }
    public void onRadioButtonClicked(View view) {
        boolean check = ((RadioButton) view).isChecked(); // Untuk memilih radio button yang ada

        switch (view.getId()){
            case R.id.button: // Kondisi ketika memilih Take Away
            if (check)
                displayToast("Take Away");
            break;
            case R.id.button2: // Kondisi ketika memilih Dine In
            if (check)
                displayToast("Dine In");
            break;
    }
}

    private void displayToast(String message) { // Untuk menampilkan toast
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void pesan_sekarang(View view) { // Untuk pindah ke halaman  Take Away setelah radio button Take Away dipilih
        if (((RadioButton) findViewById(R.id.radioButton2)).isChecked()){
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);
    } else if (((RadioButton) findViewById(R.id.radioButton)).isChecked()){ // Untuk pindah ke halaman  Dine In setelah radio button Dine In dipilih
            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this,"Pilih salah satu dari yang tersedia", Toast.LENGTH_SHORT).show(); // Pesan yang masuk ketika tidak memilih keduanya
        }
    }
}