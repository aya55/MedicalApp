package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class quesm2Activity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox9,checkBox10;
    TextView res;
    Button sub_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quesm2);
        checkBox1=findViewById(R.id.box1);
        checkBox2=findViewById(R.id.box2);
        checkBox3=findViewById(R.id.box3);
        checkBox4=findViewById(R.id.box4);
        checkBox9=findViewById(R.id.box9);
        checkBox10=findViewById(R.id.box10);
        sub_btn=(Button)findViewById(R.id.submit);
        res=(TextView)findViewById(R.id.result);

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()&checkBox2.isChecked()&checkBox3.isChecked()
                        | checkBox1.isChecked()&checkBox2.isChecked()&checkBox3.isChecked()&checkBox4.isChecked()
                        | checkBox2.isChecked()&checkBox3.isChecked()&checkBox4.isChecked()
                        | checkBox1.isChecked()&checkBox2.isChecked()&checkBox4.isChecked()
                        | checkBox4.isChecked()&checkBox1.isChecked()&checkBox4.isChecked()
                        | checkBox1.isChecked()&checkBox2.isChecked()&checkBox4.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض مرض الربو وهو يتغير بمرور الوقت فيجب متابعة طبيبك باسمرار");
                }

                if(checkBox1.isChecked()&checkBox9.isChecked()&checkBox10.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض الانسداد الرئوي المزمن لذا تجنب التدخين و ملوثات الهواء وتابع مع طبيبك");

                }


            }
        });



    }
}