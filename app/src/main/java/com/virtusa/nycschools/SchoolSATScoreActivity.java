package com.virtusa.nycschools;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.virtusa.nycschools.adapter.SchoolSATScoreAdapter;
import com.virtusa.nycschools.model.SchoolSATScoreModel;
import com.virtusa.nycschools.presenter.APIService;
import com.virtusa.nycschools.presenter.SchoolsPresenter;
import com.virtusa.nycschools.util.NetworkManager;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by madhu on 6/8/19.
 */

public class SchoolSATScoreActivity extends AppCompatActivity implements ISchoolSATScoreView {

    private static final String TAG = SchoolSATScoreActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private SchoolsPresenter schoolsPresenter;
    private SchoolSATScoreAdapter schoolSATScoreAdapter;
    private String schoolName;
    NetworkManager networkManager;
    private ArrayList<String> satScore = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nycschools);

     // get school name from nycschool activity
        Intent intent = getIntent();
        schoolName = intent.getStringExtra("school_name");
        Log.i(TAG,"name: "+schoolName);

        recyclerView = findViewById(R.id.recycleView);
        networkManager = new NetworkManager(this);

        // presenter constructor  for SATscore OF selected school
        schoolsPresenter = new SchoolsPresenter(this,networkManager,
                APIService.getIAPIInstance(),
                Schedulers.io(),
                AndroidSchedulers.mainThread());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        getSchoolSATScore(); // get SAT score for selected school
    }

    public void getSchoolSATScore(){
        schoolsPresenter.getSchoolSATScore();
    }

    // display SAT score in the recyclerview for the selected school name
    @Override
    public void displaySchoolSATData(List<SchoolSATScoreModel> satScoreModels) {
        if(satScoreModels != null){
            for(int i=0; i<satScoreModels.size();i++) {
                if ((satScoreModels.get(i).getSchool_name()).equalsIgnoreCase(schoolName)) {

                    satScore.add(satScoreModels.get(i).getSchool_name());
                    satScore.add(satScoreModels.get(i).getSat_critical_reading_avg_score());
                    satScore.add(satScoreModels.get(i).getSat_math_avg_score());
                    satScore.add(satScoreModels.get(i).getSat_writing_avg_score());
                }
            }
            schoolSATScoreAdapter = new SchoolSATScoreAdapter(satScore,this);
            recyclerView.setAdapter(schoolSATScoreAdapter);
        }
    }
    // displaying error message if it fail's to retrieval nyc schools SAT score from the API endpo
    @Override
    public void processError(Throwable exception) {
        Toast.makeText(this, "SAT score for the school Retrieval Failed", Toast.LENGTH_LONG).show();
    }
    // display toast message if no network connection.
    @Override
    public void connectionNotAvailable() {
        Toast.makeText(this,"Network connection not available,please check it once",Toast.LENGTH_LONG).show();
    }
}
