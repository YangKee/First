package com.shianchina.yang.sa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.shianchina.yang.sa.ui.activity.BaseFragmentActivity;

public class MainActivity extends BaseFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,VideoPlayerActivity.class));
            }
        },3000);
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
}