package com.example.creatinghomepage2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recylerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView=(RecyclerView) findViewById(R.id.recylerView);

        ArrayList<SchoolSubject> subjects=new ArrayList<SchoolSubject>();

        SchoolSubject math=new SchoolSubject(R.drawable.one);


        SchoolSubject history=new SchoolSubject(R.drawable.finalimage2);

        SchoolSubject geography=new SchoolSubject(R.drawable.ic_launcher_background);

        SchoolSubject science=new SchoolSubject(R.drawable.ic_launcher_background);

        SubjectAdapter adapter=new SubjectAdapter(getApplicationContext(),R.layout.rowview,subjects);
        recylerView.setAdapter(adapter);




    }
}
