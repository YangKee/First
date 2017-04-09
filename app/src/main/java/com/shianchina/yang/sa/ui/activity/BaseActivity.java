package com.shianchina.yang.sa.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;
import swipebacklayout.SwipeBackLayout;
import swipebacklayout.app.SwipeBackActivity;

/**
 * Created by Yang on 2017/3/16.
 */

public abstract class BaseActivity extends SwipeBackActivity {
    private String TAG ="";
    private SwipeBackLayout mSwipeBackLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        ButterKnife.bind(this);
        initViews();
        mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
        TAG = getLocalClassName();
    }

    protected abstract int attachLayoutRes();


    protected abstract void initViews();

    public void showLoading() {

    }

    public void hideLoading() {

    }


    protected abstract void updateViews(boolean isRefresh);
    protected void initToolBar(Toolbar toolbar, boolean homeAsUpEnabled, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUpEnabled);
    }
}
