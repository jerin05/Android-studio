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

public class small extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_small);
        ed1=(EditText) findViewById(R.id.num11);
        ed2=(EditText) findViewById(R.id.num22);
        b1=(AppCompatButton) findViewById(R.id.sbt);
        b2=(AppCompatButton) findViewById(R.id.menu2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = ed1.getText().toString();
                String n2 = ed2.getText().toString();
                int num1 = Integer.parseInt(n1);
                int num2 = Integer.parseInt(n2);
                if (num1<num2) {
                    Toast.makeText(getApplicationContext(), String.valueOf(num1), Toast.LENGTH_SHORT).show();
                } else if (num2<num1) {
                    Toast.makeText(getApplicationContext(), String.valueOf(num2), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "equal numbers", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}