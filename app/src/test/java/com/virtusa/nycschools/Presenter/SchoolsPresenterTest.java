package com.virtusa.nycschools.Presenter;

import com.virtusa.nycschools.ISchoolsView;
import com.virtusa.nycschools.model.SchoolsModel;
import com.virtusa.nycschools.presenter.IAPIInterface;
import com.virtusa.nycschools.presenter.SchoolsPresenter;
import com.virtusa.nycschools.util.NetworkManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.TestScheduler;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SchoolsPresenterTest {

    @Mock
    ISchoolsView iSchoolsView;

    @Mock
    IAPIInterface iapiInterface;

    SchoolsPresenter schoolsPresenter;
    NetworkManager networkManager;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Scheduler scheduler = Schedulers.trampoline();
        schoolsPresenter = new SchoolsPresenter(iSchoolsView, networkManager,iapiInterface, scheduler, scheduler);
    }
    @Test
    public void noInternetAccess() {
        schoolsPresenter.getSchools();
        Mockito.when(networkManager.isInternetConnectionAvailable()).thenReturn(false);
        Mockito.verify(iSchoolsView).connectionNotAvailable();
    }
    @Test
    public void getSchoolSATScore() {
        List<SchoolsModel> items = new ArrayList<>();
        SchoolsModel model = new SchoolsModel();
        model.setAttendance_rate("100");
        items.add(model);
        doReturn(Observable.just(items)).when(iapiInterface).getSchoolsData();
        verify(iSchoolsView).displayData(items);
    }

    @Test
    public void getSchoolSATScoreError() {
        Exception exception = new Exception();
        doReturn(Observable.error(exception)).when(iapiInterface).getSchoolsData();
        schoolsPresenter.getSchools();
        verify(iSchoolsView).processError(exception);
    }

    @After
    public void tearDown() throws Exception {
        schoolsPresenter = null;
    }



}
