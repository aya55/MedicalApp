package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUp_Activity extends AppCompatActivity {
    Button signupbtn;
    TextView signintxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up_);
        signupbtn=(Button)findViewById(R.id.signup);
        signintxt=(TextView)findViewById(R.id.signin_txt);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });


        signintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToSignin=new Intent(getApplicationContext(),Activity_Login.class);
                startActivity(intentToSignin);
            }
        });

    }
    public void openDialog() {
        Dialog dialog=new Dialog();
        dialog.show(getSupportFragmentManager(), "example dialog");



    }
    }
