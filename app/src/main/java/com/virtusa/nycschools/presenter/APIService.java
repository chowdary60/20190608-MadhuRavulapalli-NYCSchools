package com.virtusa.nycschools.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by madhu on 6/8/19.
 */

public class APIService {

    private static IAPIInterface iapiInterface;

    public static IAPIInterface getIAPIInstance(){   // make API call  with retrofit.

        if(iapiInterface == null) {

            Gson gson = new GsonBuilder().setLenient().create();

            iapiInterface = new Retrofit.Builder()
                    .baseUrl("https://data.cityofnewyork.us/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                    .create(IAPIInterface.class);
        }
        return iapiInterface;
    }
}
