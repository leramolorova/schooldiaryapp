package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_timetable;
    Button btn_homework;
    Button btn_events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_timetable = (Button) findViewById(R.id.btn_timetable);
        btn_timetable.setOnClickListener(this);

        btn_homework = (Button) findViewById(R.id.btn_homework);
        btn_homework.setOnClickListener(this);

        btn_events = (Button) findViewById(R.id.btn_events);
        btn_events.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_timetable:
                Intent intent = new Intent(this, TimetableActivity.class );
                startActivity(intent);
                break;
            default:
                break;
        }

        switch (v.getId()){
            case R.id.btn_homework:
                Intent intent = new Intent(this, HomeworkActivity.class );
                startActivity(intent);
                break;
            default:
                break;
        }

        switch (v.getId()){
            case R.id.btn_events:
                Intent intent = new Intent(this, EventActivity.class );
                startActivity(intent);
                break;
            default:
                break;
        }

    }


}