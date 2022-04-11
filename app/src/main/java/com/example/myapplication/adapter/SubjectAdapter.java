package com.example.myapplication.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Subject;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {


    Context context;
    List<Subject> subjects;

    public SubjectAdapter(Context context, List<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View subjectItems = LayoutInflater.from(context).inflate(R.layout.subject_item, parent, false);
        return new SubjectAdapter.SubjectViewHolder(subjectItems);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        holder.subjectBg.setBackgroundColor(Color.parseColor(subjects.get(position).getColor()));

        int imageId = context.getResources().getIdentifier( "ic_" + subjects.get(position).getImg(), "drawable", context.getPackageName());
        holder.subjectImage.setImageResource(imageId);

        holder.subjectTitle.setText(subjects.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public static final class SubjectViewHolder extends RecyclerView.ViewHolder{

        LinearLayout subjectBg;
        ImageView subjectImage;
        TextView subjectTitle;

        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);


            subjectBg = itemView.findViewById(R.id.subjectBg);
            subjectImage = itemView.findViewById(R.id.subjectImage);
            subjectBg = itemView.findViewById(R.id.subjectTitle);
        }
    }
}
