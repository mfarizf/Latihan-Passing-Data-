package com.example.latgojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFood extends AppCompatActivity implements View.OnClickListener{
    EditText nama,alamat,pesanan;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        nama = findViewById(R.id.et_nama);
        alamat = findViewById(R.id.et_alamat);
        pesanan = findViewById(R.id.et_pesanan);
        order = findViewById(R.id.btn_order);
        order.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Order order = new Order();
        order.setNama(nama.getText().toString());
        order.setAlamat(alamat.getText().toString());
        order.setPesanan(pesanan.getText().toString());
        Intent orderIntent = new Intent(GoFood.this, Orderan.class);
        orderIntent.putExtra(Orderan.EXTRA_ORDER, order);
        startActivity(orderIntent);
    }
}
