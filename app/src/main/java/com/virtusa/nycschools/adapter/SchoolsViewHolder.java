package com.virtusa.nycschools.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.virtusa.nycschools.NYCSchoolsActivity;
import com.virtusa.nycschools.R;
import com.virtusa.nycschools.RecyclerViewClickListener;
import com.virtusa.nycschools.SchoolSATScoreActivity;

/**
 * Created by madhu on 6/8/19.
 */

public class SchoolsViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

    public TextView school_name;
    private final Context context;
    private RecyclerViewClickListener mListener;

    public SchoolsViewHolder(@NonNull View itemView,RecyclerViewClickListener listener) {
        super(itemView);
        // define the view items to show school name
        school_name = itemView.findViewById(R.id.school_name);
        mListener= listener;
        context = itemView.getContext();
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //mListener.onClick(view, getAdapterPosition());
        Log.i("Madhu","school name "+school_name.getText().toString());
        Intent intent =new Intent(context,SchoolSATScoreActivity.class);
        intent.putExtra("school_name",school_name.getText().toString());
        context.startActivity(intent);

    }
}
