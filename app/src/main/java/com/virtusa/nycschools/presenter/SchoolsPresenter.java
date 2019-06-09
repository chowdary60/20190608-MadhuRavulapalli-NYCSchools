package com.virtusa.nycschools.presenter;

import android.util.Log;

import com.virtusa.nycschools.ISchoolSATScoreView;
import com.virtusa.nycschools.ISchoolsView;
import com.virtusa.nycschools.model.SchoolSATScoreModel;
import com.virtusa.nycschools.model.SchoolsModel;
import com.virtusa.nycschools.util.NetworkManager;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by madhu on 6/8/19.
 */

public class SchoolsPresenter implements SchoolsPresenterInterface{

    private ISchoolsView iSchoolsView;
    private ISchoolSATScoreView iSchoolSATScoreView;
    private IAPIInterface iapiInterface;
    private Scheduler ioScheduler;
    private Scheduler mainScheduler;
    NetworkManager networkManager;

    public SchoolsPresenter(ISchoolsView iSchoolsView,
                            NetworkManager networkManager,
                            IAPIInterface iapiInterface,
                            Scheduler ioScheduler,
                            Scheduler mainScheduler) {
        this.iSchoolsView = iSchoolsView;
        this.networkManager = networkManager;
        this.iapiInterface = iapiInterface;
        this.ioScheduler = ioScheduler;
        this.mainScheduler = mainScheduler;
    }

    public SchoolsPresenter(ISchoolSATScoreView iSchoolSATScoreView,
                            NetworkManager networkManager,
                            IAPIInterface iapiInterface,
                            Scheduler ioScheduler,
                            Scheduler mainScheduler) {
        this.iSchoolSATScoreView = iSchoolSATScoreView;
        this.networkManager = networkManager;
        this.iapiInterface = iapiInterface;
        this.ioScheduler = ioScheduler;
        this.mainScheduler = mainScheduler;
    }


    // get school names data
    @Override
    public void getSchools() {
        if(!networkManager.isInternetConnectionAvailable()) {
            iSchoolsView.connectionNotAvailable();
            return;
        }
        getObservable().subscribe(getObserver());
    }
   // get school sat score data
    @Override
    public void getSchoolSATScore() {
        if(!networkManager.isInternetConnectionAvailable()) {
            iSchoolSATScoreView.connectionNotAvailable();
            return;
        }
        getSchoolSATScoreObservable().subscribe(getSchoolSATScoreObserver());
    }

    public Observable<List<SchoolSATScoreModel>> getSchoolSATScoreObservable(){
        return iapiInterface
                .getSchoolSATData()
                .subscribeOn(ioScheduler)
                .observeOn(mainScheduler);
    }

    public Observable<List<SchoolsModel>> getObservable(){
        return iapiInterface
                .getSchoolsData()
                .subscribeOn(ioScheduler)
                .observeOn(mainScheduler);
    }

    public DisposableObserver<List<SchoolSATScoreModel>> getSchoolSATScoreObserver(){
        return new DisposableObserver<List<SchoolSATScoreModel>>() {
            @Override
            public void onNext(List<SchoolSATScoreModel> schoolSATScoreModels) {
                iSchoolSATScoreView.displaySchoolSATData(schoolSATScoreModels); // update the view with the sat score
            }

            @Override
            public void onError(Throwable e) {
                iSchoolSATScoreView.processError(e); // update view with the error  if failed to access the data
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                Log.d("madhu","Completed");
            }
        };
    }

    public DisposableObserver<List<SchoolsModel>> getObserver(){
        return new DisposableObserver<List<SchoolsModel>>() {

            @Override
            public void onNext(@NonNull List<SchoolsModel> schoolsModelList) {
                iSchoolsView.displayData(schoolsModelList); // update the view with school names
            }

            @Override
            public void onError(@NonNull Throwable e) {
                iSchoolsView.processError(e); // update view with the error  if failed to access the data
                e.printStackTrace();
            }

            @Override
            public void onComplete() {

            }
        };
    }
}
