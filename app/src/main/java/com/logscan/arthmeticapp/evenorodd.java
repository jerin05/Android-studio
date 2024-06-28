package com.logscan.arthmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class evenorodd extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_evenorodd);
        ed1 = (EditText) findViewById(R.id.num111);
        b1 = (AppCompatButton) findViewById(R.id.oddeven);
        b2 = (AppCompatButton) findViewById(R.id.menu3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = ed1.getText().toString();
                int num1 = Integer.parseInt(n1);
                if (num1 / 2 == 0) {
                    Toast.makeText(getApplicationContext(), " EVEN", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "ODD", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}