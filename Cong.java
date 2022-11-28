package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Cong extends AppCompatActivity {
    private Button btncongback, btntong;
    private EditText num1,num2;
    private TextView txtketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btntong = (Button) findViewById(R.id.btntong);
        txtketqua = (TextView) findViewById(R.id.txtketqua);


        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());
                int tong = so1 + so2;

                txtketqua.setText(String.valueOf(tong));
            }
        });

        btncongback = (Button)findViewById(R.id.btncongback);
        btncongback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cong.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}