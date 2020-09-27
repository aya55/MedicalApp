package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class quesm5Activity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11;
    TextView res;
    Button sub_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quesm5);
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
                if(checkBox5.isChecked()&checkBox6.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض إعتام عدسة العين لذا يمكنك إجراء جراحة عندما يكون ذلك مناسبًا لك وعندما يتداخل فقدان الرؤية من إعتام عدسة العين مع أنشطتك اليومية");
                }

                if(checkBox1.isChecked()&checkBox2.isChecked()&checkBox3.isChecked()
                        | checkBox2.isChecked()&checkBox3.isChecked()&checkBox4.isChecked()
                        | checkBox3.isChecked()&checkBox4.isChecked()&checkBox9.isChecked()
                        | checkBox1.isChecked()&checkBox2.isChecked()&checkBox5.isChecked()
                        | checkBox4.isChecked()&checkBox9.isChecked()&checkBox10.isChecked()
                        | checkBox9.isChecked()&checkBox5.isChecked()&checkBox10.isChecked()
                        | checkBox1.isChecked()&checkBox2.isChecked()&checkBox10.isChecked()
                        | checkBox3.isChecked()&checkBox10.isChecked()&checkBox9.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض Glaucoma لذا احصل على فحص للعين وتعرف على تاريخ صحة عين عائلتك وارتدي نظارة وتناول قطرات العين الموصوفة بانتظام");

                }

                if(checkBox9.isChecked()&checkBox10.isChecked()&checkBox11.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض التهاب الملتحمة لذا تجنب ملامسة اليدين للعينين. واغسل اليدين في أوقات متقاربة");
                }

                if(checkBox5.isChecked()&checkBox7.isChecked()&checkBox8.isChecked()
                        | checkBox5.isChecked()&checkBox8.isChecked()&checkBox11.isChecked()
                        | checkBox7.isChecked()&checkBox8.isChecked()&checkBox11.isChecked()
                        | checkBox5.isChecked()&checkBox7.isChecked()&checkBox11.isChecked())
                {
                    res.setText("من الممكن ان يكون لديك اعراض الماء الأبيض لذا عليك إجراء فحوص منتظمة للعيون والإقلاع عن التدخين واختيار النظام الغذائي الصحي  وارتداء النظارة الشمسية");
                }

            }
        });

    }
}