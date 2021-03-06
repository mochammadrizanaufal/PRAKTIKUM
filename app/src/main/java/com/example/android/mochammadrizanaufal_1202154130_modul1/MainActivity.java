package com.example.android.mochammadrizanaufal_1202154130_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //int uangsaku = 65500;
    int harga;
    EditText makanan;
    EditText jumlah;
    String mkn, jml;
    Bundle b = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makanan = (EditText) findViewById(R.id.txt_makanan);
        jumlah = (EditText) findViewById(R.id.txt_porsi);

    }

    public void onEatbus(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        jml = jumlah.getText().toString();
        mkn = makanan.getText().toString();
        harga=Integer.parseInt(jml)*50000;

        if(mkn.matches("Nasi Uduk")){
            b.putString("resto", "EATBUS");
            b.putString("makanan", makanan.getText().toString());
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            startActivity(intent);

        }else {

            Toast toast = Toast.makeText(this,"Harus Nasi Uduk bre" , Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onAbnormal(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        jml = jumlah.getText().toString();
        mkn = makanan.getText().toString();
        harga = Integer.parseInt(jml) * 30000;

        if(mkn.matches("Nasi Uduk")){
            b.putString("resto", "ABNORMAL");
            b.putString("makanan", makanan.getText().toString());
            b.putString("jumlah", jumlah.getText().toString());
            b.putString("harga", String.valueOf(harga));
            intent.putExtras(b);
            startActivity(intent);

        }else {

            Toast toast = Toast.makeText(this,"Harus Nasi Uduk bre" , Toast.LENGTH_LONG);
            toast.show();
        }
    }
}