package com.example.a05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText year,month,day,hour,min,sec;
    private TextView Year,all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year = (EditText)findViewById(R.id.year);
        month = (EditText)findViewById(R.id.month);
        day = (EditText)findViewById(R.id.day);
        hour = (EditText)findViewById(R.id.hour);
        min = (EditText)findViewById(R.id.minute);
        sec = (EditText)findViewById(R.id.second);
        Year = (TextView)findViewById(R.id.Year);
        all = (TextView)findViewById(R.id.all);
    }

    public void change(View view) {
        String Year = year.getEditableText().toString();
        String Month = month.getEditableText().toString();
        String Day = day.getEditableText().toString();
        String Hour = hour.getEditableText().toString();
        String Min = min.getEditableText().toString();
        String Sec = sec.getEditableText().toString();
        all.setText(Year + "/" + Month + "/" + Day + " " + Hour + ":" + Min + ":" + Sec);
    }
}