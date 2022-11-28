package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tru extends AppCompatActivity {
    private Button btntruback, btntru;
    private EditText num1,num2;
    private TextView txtketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tru);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btntru = (Button) findViewById(R.id.btntru);
        txtketqua = (TextView) findViewById(R.id.txtketqua);

        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());
                int hieu = so1 - so2;

                txtketqua.setText(String.valueOf(hieu));
            }
        });

        btntruback = (Button)findViewById(R.id.btntruback);
        btntruback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tru.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}