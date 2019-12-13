package com.example.techapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText e1,e2;
   Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Login Sucess",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,home.class));
                }
                if (e1.getText().toString().equals(" ") || e2.getText().toString().equals(" ")){
                    Toast.makeText(MainActivity.this,"Enter Email or Password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid Email or Password",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
