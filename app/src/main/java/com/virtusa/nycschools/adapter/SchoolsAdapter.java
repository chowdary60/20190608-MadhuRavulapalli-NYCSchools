package com.virtusa.nycschools.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.virtusa.nycschools.R;
import com.virtusa.nycschools.RecyclerViewClickListener;
import com.virtusa.nycschools.model.SchoolsModel;

import java.util.List;


/**
 * Created by madhu on 6/8/19.
 */

public class SchoolsAdapter extends RecyclerView.Adapter<SchoolsViewHolder> {

    List<SchoolsModel> schoolsnames;

    private RecyclerViewClickListener mListener; // listener for recyclerview

    public SchoolsAdapter(List<SchoolsModel> schoolsnames,RecyclerViewClickListener mListener){
        this.schoolsnames = schoolsnames; // school names assigned
        this.mListener = mListener;

    }
    @NonNull
    @Override
    public SchoolsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      // inflate the layout for school names to show
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.school_item,viewGroup,false);
       return new SchoolsViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolsViewHolder schoolsViewHolder, int position) {
        // set school name
        schoolsViewHolder.school_name.setText(schoolsnames.get(position).getSchool_name());

    }

    @Override
    public int getItemCount() {
        return schoolsnames.size(); // size of the school names list
    }
}
