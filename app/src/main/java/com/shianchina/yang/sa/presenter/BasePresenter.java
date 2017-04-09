package com.shianchina.yang.sa.presenter;

import rx.Subscription;

/**
 * Created by Yang on 2017/3/16.
 */

public interface BasePresenter {
    void unsubscribe();
    void addSubscription(Subscription s);
}
