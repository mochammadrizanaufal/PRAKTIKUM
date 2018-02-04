package com.example.android.mochammadrizanaufal_1202154130_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int uangsaku = 65500;
    EditText jumlah;
    Bundle b = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onEatbus(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*50000;

        if (harga > uangsaku){

            b.putString("resto", "EATBUS");
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            Toast.makeText(this, "Jangan makan malam disini,uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }else{
            b.putString("resto", "EATBUS");
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga = Integer.parseInt(jml) * 30000;


        if (harga > uangsaku){

            b.putString("resto", "EATBUS");
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            Toast.makeText(this, "Jangan makan malam disini,uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }else{
            b.putString("resto", "EATBUS");
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }
        startActivity(intent);
    }
}