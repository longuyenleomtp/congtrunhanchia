package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btncong, btntru, btnchia, btnnhan, btnchialaydu, btnlog, btnsosanh;
    private TextView txtchialaydu, txtsosanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btncong = (Button)findViewById(R.id.btncong);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Cong.class);
                startActivity(i);
            }
        });

        btntru = (Button)findViewById(R.id.btntru);
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Tru.class);
                startActivity(i);
            }
        });

        btnnhan = (Button)findViewById(R.id.btnnhan);
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Nhan.class);
                startActivity(i);
            }
        });

        btnchia = (Button)findViewById(R.id.btnchia);
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Chia.class);
                startActivity(i);
            }
        });

        btnlog = (Button)findViewById(R.id.btnlog);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Logarit.class);
                startActivity(i);
            }
        });

        btnchialaydu = (Button)findViewById(R.id.btnchialaydu);
        btnchialaydu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Chialaydu.class);
                startActivity(i);
            }
        });

        btnsosanh = (Button)findViewById(R.id.btnsosanh);
        btnsosanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Sosanh.class);
                startActivity(i);
            }
        });
    }
}