package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Login extends AppCompatActivity {
    Button logBut;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);
        logBut=(Button)findViewById(R.id.signin);
        logBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToHome=new Intent(getApplicationContext(),Activity_Main_home.class);
                startActivity(intentToHome);
            }
        });

        signup=(TextView)findViewById(R.id.signup_txt);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToSignup=new Intent(getApplicationContext(),SingUp_Activity.class);
                startActivity(intentToSignup);
            }
        });

    }
}