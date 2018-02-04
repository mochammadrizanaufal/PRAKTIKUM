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
        TextView porsi = (TextView) findViewById(R.id.txt_jumlah2);
        TextView harga = (TextView) findViewById(R.id.txt_harga2);

        resto.setText(b.getCharSequence("resto"));
        porsi.setText(b.getCharSequence("jumlah"));
        harga.setText(b.getCharSequence("harga"));


    }
}
