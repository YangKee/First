package com.shianchina.yang.sa.presenter.impl;

import android.content.Context;

import com.shianchina.yang.sa.api.RetrofitService;
import com.shianchina.yang.sa.api.bean.google.PlaceSearchResult;
import com.shianchina.yang.sa.api.key.GoogleCommon;
import com.shianchina.yang.sa.view.MainView;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Yang on 2017/3/16.
 */

public class MainPresenter extends BasePresenterImpl{
    private Context mContext;
    private MainView mMainView;

    public MainPresenter(Context context, MainView mainView) {
        mContext = context;
        mMainView = mainView;
    }

    public void doSearch(String keyword){
        mMainView.showWaiteDialog(true);
        Subscription subscription = RetrofitService.getInstence().getGoogleApi().queryPlace(keyword, GoogleCommon.GOOGLE_KEY)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PlaceSearchResult>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        mMainView.showWaiteDialog(false);
                    }

                    @Override
                    public void onNext(PlaceSearchResult placeSearchList) {
                        mMainView.showWaiteDialog(false);
                        mMainView.loadData(placeSearchList);
                    }
                });
//        addSubscription(subscription);
    }
}
