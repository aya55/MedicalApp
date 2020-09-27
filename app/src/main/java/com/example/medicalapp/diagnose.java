package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class diagnose extends AppCompatActivity {
    Button diag_btn;
    RadioGroup group1,group2,group3,group4,group5,group6,group7,group8,group9,group10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnose);
        group1=(RadioGroup)findViewById(R.id.group1);
        group2=(RadioGroup)findViewById(R.id.group2);
        group3=(RadioGroup)findViewById(R.id.group3);
        group4=(RadioGroup)findViewById(R.id.group4);
        group5=(RadioGroup)findViewById(R.id.group5);
        group6=(RadioGroup)findViewById(R.id.group6);
        group7=(RadioGroup)findViewById(R.id.group7);
        group8=(RadioGroup)findViewById(R.id.group8);
        group9=(RadioGroup)findViewById(R.id.group9);
        group10=(RadioGroup)findViewById(R.id.group10);
        diag_btn=(Button)findViewById(R.id.diagnose);
        diag_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int radioid1=group1.getCheckedRadioButtonId();
                int radioid2=group2.getCheckedRadioButtonId();
                int radioid3=group3.getCheckedRadioButtonId();
                int radioid4=group4.getCheckedRadioButtonId();
                int radioid5=group5.getCheckedRadioButtonId();
                int radioid6=group6.getCheckedRadioButtonId();
                int radioid7=group7.getCheckedRadioButtonId();
                int radioid8=group8.getCheckedRadioButtonId();
                int radioid9=group9.getCheckedRadioButtonId();
                int radioid10=group10.getCheckedRadioButtonId();

                if (radioid1==1)
                {
                    opendialog2();

                }
                else{
                    opendialog();
                }
            }
        });


    }
    public void opendialog(){
        Diagnosal_Dialog dialog=new Diagnosal_Dialog();
        dialog.show(getSupportFragmentManager(),"Alert Dialog");

    }

    public void opendialog2(){
        DiagnoseDialog2 dialog=new DiagnoseDialog2();
        dialog.show(getSupportFragmentManager(),"Alert Dialog");

    }
}
