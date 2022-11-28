package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nhan extends AppCompatActivity {
    private Button btnnhanback, btnnhan;
    private EditText num1,num2;
    private TextView txtketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btnnhan = (Button) findViewById(R.id.btnnhan);
        txtketqua = (TextView) findViewById(R.id.txtketqua);

        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());
                int tich = so1 * so2;

                txtketqua.setText(String.valueOf(tich));
            }
        });

        btnnhanback = (Button)findViewById(R.id.btnnhanback);
        btnnhanback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Nhan.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}