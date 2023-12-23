package com.example.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class output extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        t1=(TextView) findViewById(R.id.textView1);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);
        t5=(TextView) findViewById(R.id.textView5);
        t6=(TextView) findViewById(R.id.textView6);
        t7=(TextView) findViewById(R.id.textView7);
        t8=(TextView) findViewById(R.id.textView8);
        t9=(TextView) findViewById(R.id.textView9);

        Intent i = getIntent();


        s1=i.getStringExtra("full_name");
        s2=i.getStringExtra("gender");
        s3=i.getStringExtra("email");
        s4=i.getStringExtra("phone");
        s5=i.getStringExtra("date");
        s6=i.getStringExtra("time");
        s7=i.getStringExtra("speciality");
        s8=i.getStringExtra("name");
        s9=i.getStringExtra("details");

        t1.setText("Name: "+s1);
        t2.setText("Gender: "+s2);
        t3.setText("Email: "+s3);
        t4.setText("Phone: "+s4);
        t5.setText("Date: "+s5);
        t6.setText("Time: "+s6);
        t7.setText("Speciality: "+s7);
        t8.setText("Doctor name: "+s8);
        t9.setText("Details: "+s9);
    }
}