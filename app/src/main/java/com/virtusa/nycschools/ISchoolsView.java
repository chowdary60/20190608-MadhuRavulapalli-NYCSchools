package com.virtusa.nycschools;

import com.virtusa.nycschools.model.SchoolSATScoreModel;
import com.virtusa.nycschools.model.SchoolsModel;

import java.util.List;

/**
 * Created by madhu on 6/8/19.
 */

public interface ISchoolsView {
    // school view interface methods for data,error, internet connection.
    void displayData(List<SchoolsModel> modelList);
    void processError(Throwable exception);
    void connectionNotAvailable();

}
