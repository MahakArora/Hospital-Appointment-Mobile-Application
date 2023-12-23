package com.example.hospitalappointment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button b3;
    Spinner sp1,sp2;

    RadioGroup r;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.name_text);
        e2=(EditText) findViewById(R.id.email_text);
        e3=(EditText) findViewById(R.id.phone_code);
        e4=(EditText) findViewById(R.id.phone_number);
        e5=(EditText) findViewById(R.id.editTextTextMultiLine);

        r= (RadioGroup) findViewById(R.id.gender_button);

        b3=(Button) findViewById(R.id.submit_button);

        sp1=(Spinner) findViewById(R.id.Spinner1);
        sp2=(Spinner) findViewById(R.id.Spinner2);

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                s1=e1.getText().toString();
                s3=e2.getText().toString();
                s4=(e3.getText().toString())+" "+(e4.getText().toString());
                s9=e5.getText().toString();
                s7=sp1.getSelectedItem().toString();
                s8=sp2.getSelectedItem().toString();


                Intent i=new Intent(MainActivity.this,output.class);
                i.putExtra("full_name",s1);
                i.putExtra("gender",s2);
                i.putExtra("email",s3);
                i.putExtra("phone",s4);
                i.putExtra("date",s5);
                i.putExtra("time",s6);
                i.putExtra("speciality",s7);
                i.putExtra("name",s8);
                i.putExtra("details",s9);

                startActivity(i);
            }
        });
    }



    public void onRadioButtonClicked(View view) {
        boolean checked=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.male:if(checked) s2="Male"; break;
            case R.id.female: if(checked) s2="Female"; break;
            default: break;
        }
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment=new date_picker();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment=new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string=Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        s5=(day_string+"/" +month_string+"/"+year_string);
    }

    public void processTimePickerResult(int hour, int min) {
        String hour_string=Integer.toString(hour+1);
        String min_string = Integer.toString(min);
        s6=(hour_string+":" +min_string);
    }
}