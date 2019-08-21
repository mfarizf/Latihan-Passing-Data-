package com.example.latgojek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Orderan extends AppCompatActivity {
    public static String EXTRA_ORDER = "extra_order";
    private TextView tv_nama,tv_alamat,tv_pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderan);
        tv_nama = findViewById(R.id.tv_nama);
        tv_alamat = findViewById(R.id.tv_alamat);
        tv_pesanan = findViewById(R.id.tv_pesanan);
        Order order =getIntent().getParcelableExtra(EXTRA_ORDER);

        String nama = "Nama : "+order.getNama();
        String alamat = "Alamat : "+order.getAlamat();
        String pesanan = "Pesanan : "+order.getPesanan();

        tv_nama.setText(nama);
        tv_alamat.setText(alamat);
        tv_pesanan.setText(pesanan);
    }
}
