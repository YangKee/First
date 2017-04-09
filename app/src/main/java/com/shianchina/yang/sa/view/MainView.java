package com.shianchina.yang.sa.view;

/**
 * Created by Yang on 2017/3/16.
 */

public interface MainView<T> extends BaseView {
    void loadData(T d);
}
