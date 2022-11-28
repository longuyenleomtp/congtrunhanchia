package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Logarit extends AppCompatActivity {
    private Button btnlogback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logarit);

        btnlogback = (Button)findViewById(R.id.btnlogback);
        btnlogback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Logarit.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}