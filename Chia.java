package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Chia extends AppCompatActivity {
    private Button btnchiaback, btnchia;
    private EditText num1,num2;
    private TextView txtketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chia);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btnchia = (Button) findViewById(R.id.btnchia);
        txtketqua = (TextView) findViewById(R.id.txtketqua);

        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());
                int thuong = so1 / so2;

                txtketqua.setText(String.valueOf(thuong));
            }
        });

        btnchiaback = (Button)findViewById(R.id.btnchiaback);
        btnchiaback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chia.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}