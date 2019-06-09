package com.virtusa.nycschools;

import com.virtusa.nycschools.model.SchoolSATScoreModel;

import java.util.List;

/**
 * Created by madhu on 6/8/19.
 */

public interface ISchoolSATScoreView {
    // SAT score view interface methods for data,error, internet connection.
    void displaySchoolSATData(List<SchoolSATScoreModel> satScoreModels);
    void processError(Throwable exception);
    void connectionNotAvailable();
}
