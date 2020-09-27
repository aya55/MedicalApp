package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ProtectActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        ImageAdapter adpater=new ImageAdapter(this);
        viewPager.setAdapter(adpater);
    }
}