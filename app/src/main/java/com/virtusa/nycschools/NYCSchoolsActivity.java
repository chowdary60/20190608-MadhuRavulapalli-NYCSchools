package com.virtusa.nycschools;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import android.widget.Toast;

import com.virtusa.nycschools.adapter.SchoolsAdapter;
import com.virtusa.nycschools.model.SchoolsModel;
import com.virtusa.nycschools.presenter.APIService;
import com.virtusa.nycschools.presenter.SchoolsPresenter;
import com.virtusa.nycschools.util.NetworkManager;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class NYCSchoolsActivity extends AppCompatActivity implements ISchoolsView,RecyclerViewClickListener {

    private static final String TAG = NYCSchoolsActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private SchoolsPresenter schoolsPresenter;
    private SchoolsAdapter schoolsAdapter;
    private RecyclerViewClickListener listener;
    NetworkManager networkManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nycschools);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // toolbar fancy stuff
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("NYCSchoolNames");

        networkManager = new NetworkManager(this);

        recyclerView = findViewById(R.id.recycleView);
        // presenter constuctor
        schoolsPresenter = new SchoolsPresenter(this,networkManager,
                APIService.getIAPIInstance(),
                Schedulers.io(),
                AndroidSchedulers.mainThread());

        //initialize the recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        getSchools();  // get nyc schools data

    }
    private void getSchools() {
        schoolsPresenter.getSchools();
    }

    // displaying data in recyclerview with the help of adapter
    @Override
    public void displayData(List<SchoolsModel> schoolsModelList) {
        if(schoolsModelList != null){
            schoolsAdapter = new SchoolsAdapter(schoolsModelList, this);
            recyclerView.setAdapter(schoolsAdapter);
        }
    }

    // displaying error message if it fail's to retrieval nyc schools names from the API endpoint
    @Override
    public void processError(Throwable exception) {
        Toast.makeText(this, "NYC School names Retrieval Failed", Toast.LENGTH_LONG).show();
    }

    // display toast message if no network connection.
    @Override
    public void connectionNotAvailable() {
        Toast.makeText(this,"Network connection not available,please check it once",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view, int position) {
        Log.i(TAG,"position: "+position);
    }
}
