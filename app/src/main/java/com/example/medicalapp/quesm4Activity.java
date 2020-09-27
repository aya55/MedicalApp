package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class quesm4Activity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12;
    TextView res;
    Button sub_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quesm4);
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
        checkBox12=findViewById(R.id.box12);
        sub_btn=(Button)findViewById(R.id.submit);
        res=(TextView)findViewById(R.id.result);

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(checkBox1.isChecked()&checkBox2.isChecked()&checkBox3.isChecked()
                        | checkBox1.isChecked()&checkBox3.isChecked()&checkBox4.isChecked()
                        | checkBox2.isChecked()&checkBox3.isChecked()&checkBox4.isChecked()
                        | checkBox2.isChecked()&checkBox4.isChecked()&checkBox9.isChecked()
                        | checkBox1.isChecked()&checkBox3.isChecked()&checkBox9.isChecked()
                        | checkBox4.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox2.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox1.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox1.isChecked()&checkBox3.isChecked()&checkBox10.isChecked()
                        | checkBox2.isChecked()&checkBox4.isChecked()&checkBox10.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض الحساسية لذا يجب الخضوع للفحوص لتحديد ما إذا كان لديك حساسية شديدة واستخدام مضادات الهيستامين");
                }

                if(checkBox5.isChecked()&checkBox6.isChecked()&checkBox7.isChecked()
                        | checkBox5.isChecked()&checkBox7.isChecked()&checkBox8.isChecked()
                        | checkBox7.isChecked()&checkBox6.isChecked()&checkBox8.isChecked()
                        | checkBox5.isChecked()&checkBox6.isChecked()&checkBox8.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض البرد والانفلونزا لذا عليك التالى استرح أكثر من المعتاد واشرب الكثير من السوائلوابتعد عن الدخان وتجنب الكافيين");
                }

                if(checkBox11.isChecked()&checkBox12.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض التهاب الأذن الوسطى وإذا استمرت الأعراض أكثر من يوم واحد ووجود ألم شديد في الأذن و خروج إفرازات أو دم من الأذن يجب متابعة الطبيب");
                }

                if(checkBox6.isChecked()&checkBox7.isChecked()&checkBox8.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض حساسية الأنف لذا من استخدم مضادات الهستامين او بخاخ الستيرويد");
                }

            }
        });

    }
}