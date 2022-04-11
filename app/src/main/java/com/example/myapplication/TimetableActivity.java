package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapter.SubjectAdapter;
import com.example.myapplication.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class TimetableActivity extends AppCompatActivity {

    private RecyclerView subjectRecycler;
    private SubjectAdapter subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);


        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject(1, "icon1", "#a9deab", "Monday"));
        subjectList.add(new Subject(1, "icon1", "#a9deab", "Tuesday"));
        
        setSubjectRecycler(subjectList);
    }

    private void setSubjectRecycler(List<Subject> subjectList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        subjectRecycler = findViewById(R.id.subjectRecycler);
        subjectRecycler.setLayoutManager(layoutManager);

        subjectAdapter = new SubjectAdapter(this, subjectList);
        subjectRecycler.setAdapter(subjectAdapter);
    }
}