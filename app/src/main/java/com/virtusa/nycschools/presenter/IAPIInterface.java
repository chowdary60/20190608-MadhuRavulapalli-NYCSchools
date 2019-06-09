package com.virtusa.nycschools.presenter;

import com.virtusa.nycschools.model.SchoolSATScoreModel;
import com.virtusa.nycschools.model.SchoolsModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by madhu on 6/8/19.
 */

public interface IAPIInterface {

    @GET("resource/s3k6-pzi2.json")
    Observable<List<SchoolsModel>> getSchoolsData(); // observable for school names
    @GET("resource/f9bf-2cp4.json")
    Observable<List<SchoolSATScoreModel>> getSchoolSATData(); // observable for sat scores.
}
