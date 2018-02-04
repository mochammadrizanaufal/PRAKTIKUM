package com.example.android.mochammadrizanaufal_1202154130_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();


        TextView resto = (TextView) findViewById(R.id.txt_resto);
        TextView makanan = (TextView) findViewById(R.id.txt_makanan2);
        TextView jumlah = (TextView) findViewById(R.id.txt_jumlah2);
        TextView harga = (TextView) findViewById(R.id.txt_harga2);

        resto.setText(b.getString("resto"));
        makanan.setText(b.getString("makanan"));
        jumlah.setText(b.getString("jumlah"));
        harga.setText(b.getString("harga"));
    }
}
