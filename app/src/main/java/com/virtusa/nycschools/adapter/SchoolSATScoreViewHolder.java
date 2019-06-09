package com.virtusa.nycschools.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.virtusa.nycschools.R;

/**
 * Created by madhu on 6/8/19.
 */

public class SchoolSATScoreViewHolder extends RecyclerView.ViewHolder {
    public TextView school_name;
    public TextView sat_critical_reading_avg_score;
    public TextView sat_math_avg_score;
    public TextView sat_writing_avg_score;

    public SchoolSATScoreViewHolder(@NonNull View itemView) {
        super(itemView);
        // define the view items to show sat scores
        school_name = itemView.findViewById(R.id.school_name);
        sat_critical_reading_avg_score = itemView.findViewById(R.id.sat_critical_reading_avg_score);
        sat_math_avg_score = itemView.findViewById(R.id.sat_math_avg_score);
        sat_writing_avg_score = itemView.findViewById(R.id.sat_writing_avg_score);
    }
}
