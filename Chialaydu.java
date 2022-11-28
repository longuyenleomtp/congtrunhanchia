package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Chialaydu extends AppCompatActivity {

    private Button btnchialayduback, btnchialaydu;
    private EditText num1,num2;
    private TextView txtketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chialaydu);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btnchialaydu = (Button) findViewById(R.id.btnchialaydu);
        txtketqua = (TextView) findViewById(R.id.txtketqua);

        btnchialaydu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());
                int rs = so1 / so2;
                int phandu = so1 -(rs*so2);

                txtketqua.setText(String.valueOf(phandu));
            }
        });


        btnchialayduback = (Button)findViewById(R.id.btnchilayduback);
        btnchialayduback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chialaydu.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}