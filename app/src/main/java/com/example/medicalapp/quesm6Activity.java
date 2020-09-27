package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class quesm6Activity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11;
    TextView res;
    Button sub_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quesm6);
        checkBox1=findViewById(R.id.box1);
        checkBox2=findViewById(R.id.box2);
        checkBox3=findViewById(R.id.box3);
        checkBox4=findViewById(R.id.box4);
        checkBox5=findViewById(R.id.box5);
        checkBox6=findViewById(R.id.box6);
        checkBox7=findViewById(R.id.box7);
        checkBox8=findViewById(R.id.box8);
        checkBox9=findViewById(R.id.box9);
        checkBox10=findViewById(R.id.box10);
        checkBox11=findViewById(R.id.box11);
        sub_btn=(Button)findViewById(R.id.submit);
        res=(TextView)findViewById(R.id.result);


        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()&checkBox2.isChecked()&checkBox3.isChecked()){
                    res.setText("من الممكن ان يكون لديك اعراض حب الشباب لذا تجنب أي ضرر لبشرتك واستخدم مضادات حيوية والأدوية الشبيهة بالريتينويد");
                }

                if(checkBox4.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox4.isChecked()&checkBox7.isChecked()&checkBox9.isChecked()
                        | checkBox4.isChecked()&checkBox7.isChecked()&checkBox8.isChecked()
                        | checkBox4.isChecked()&checkBox11.isChecked()&checkBox8.isChecked()
                        | checkBox7.isChecked()&checkBox8.isChecked()&checkBox11.isChecked()
                        | checkBox11.isChecked()&checkBox8.isChecked()&checkBox10.isChecked()
                        | checkBox11.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox3.isChecked()&checkBox8.isChecked()&checkBox9.isChecked()
                        | checkBox7.isChecked()&checkBox9.isChecked()&checkBox10.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض صدفية لذا استخدم الستيروئيدات القشرية ونظائر فيتامين د");
                }

                if(checkBox4.isChecked()&checkBox9.isChecked()&checkBox5.isChecked()
                        | checkBox4.isChecked()&checkBox5.isChecked()&checkBox6.isChecked()
                        | checkBox9.isChecked()&checkBox5.isChecked()&checkBox6.isChecked()
                        | checkBox4.isChecked()&checkBox6.isChecked()&checkBox9.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض الطفح الجلدي لذا استخدم كريمات مضادة للحكة ومستحضرات ترطيب والأدوية الموضعية المضادة للفطريات");
                }
            }
        });



    }
}