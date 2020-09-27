package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CoronaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona);
        final CardView cv11 , cv12,cv13,cv14;

        // GridLayout gridLayout=findViewById(R.id.gradview);
        cv11=(CardView)findViewById(R.id.cv11);
        cv12=(CardView)findViewById(R.id.cv12);
        cv13=(CardView)findViewById(R.id.cv13);
        cv14=(CardView)findViewById(R.id.cv14);

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),diagnose.class);
                startActivity(intent);
            }
        });
        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),ProtectActivity.class);
                startActivity(intent);

            }
        });
        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),VersesActivity.class);
                startActivity(intent);

            }
        });

        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),faqsActivity.class);
                startActivity(intent);
            }
        });
    }
}