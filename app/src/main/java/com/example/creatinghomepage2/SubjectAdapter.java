package com.example.creatinghomepage2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SubjectAdapter extends ArrayAdapter<SchoolSubject> {

    Context context;
    int resource;
    ArrayList<SchoolSubject> subjects = null;

    public SubjectAdapter(@NonNull Context context, int resource,ArrayList<SchoolSubject> subjects) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.subjects = subjects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SchoolSubject subject=subjects.get(position);
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.rowview,parent,false);
        }
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);


        imageView.setImageResource(subject.imageId);
        return convertView;

    }
}
