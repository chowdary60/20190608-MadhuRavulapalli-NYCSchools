package com.virtusa.nycschools.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.virtusa.nycschools.R;
import java.util.ArrayList;


/**
 * Created by madhu on 6/8/19.
 */

public class SchoolSATScoreAdapter extends RecyclerView.Adapter<SchoolSATScoreViewHolder> {

    ArrayList<String> SATScore;
    View view;
    Context context;


    public SchoolSATScoreAdapter( ArrayList<String> SATScore,Context context){

        this.SATScore = SATScore; // sat score list for selcted school name
        this.context = context;
    }
    @NonNull
    @Override
    public SchoolSATScoreViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // inflate the layout to show sat scores.
         view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.satscore_item,viewGroup,false);
        return new SchoolSATScoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolSATScoreViewHolder schoolSATScoreViewHolder, int position) {

        // set sat scores to views
        if(SATScore.size()!=0) {
           schoolSATScoreViewHolder.school_name.setText("School Name:   "+SATScore.get(0));
           schoolSATScoreViewHolder.sat_critical_reading_avg_score.setText("SAT critical_reading_avg_score:    "+SATScore.get(1));
           schoolSATScoreViewHolder.sat_math_avg_score.setText("SAT_math_avg_score :    "+SATScore.get(2));
           schoolSATScoreViewHolder.sat_writing_avg_score.setText("sat_writing_avg_score:   "+SATScore.get(3));

       }

       if(SATScore.size()==0){
            view.setVisibility(View.GONE);
            Toast.makeText(context,"SAT score was not available for the selected school",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public int getItemCount() {

        return 1;
    }
}
