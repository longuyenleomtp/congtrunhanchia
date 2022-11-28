package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sosanh extends AppCompatActivity {

    private Button btnsosanhback, btnsosanh;
    private EditText num1,num2;
    private TextView txtketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosanh);

        num1 = (EditText) findViewById(R.id.edtnumone);
        num2 = (EditText) findViewById(R.id.edtnumtwo);
        btnsosanhback = (Button) findViewById(R.id.btnsosanh);
        txtketqua = (TextView) findViewById(R.id.txtketqua);

        btnsosanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int so1 = Integer.parseInt(num1.getText().toString());
                int so2 = Integer.parseInt(num2.getText().toString());

                if(so1>so2) {
                    txtketqua.setText("So thứ nhất lớn hơn số thứ hai");
                }
                if(so1<so2) {
                    txtketqua.setText("So thứ hai lớn hơn số thứ nhất");
                }
                if(so1==so2) {
                    txtketqua.setText("So thứ nhất bằng số thứ hai");
                }
            }
        });

        btnsosanhback = (Button)findViewById(R.id.btnsosanhback);
        btnsosanhback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sosanh.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}