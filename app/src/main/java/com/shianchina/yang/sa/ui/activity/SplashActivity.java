package com.shianchina.yang.sa.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;

import com.shianchina.yang.sa.MainActivity;
import com.shianchina.yang.sa.R;
import com.shianchina.yang.sa.VideoPlayerActivity;

/**
 * Created by Yang on 2017/3/22.
 */

public class SplashActivity extends BaseActivity  {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyHandler myHandler = new MyHandler();
        myHandler.sendEmptyMessageDelayed(2,2*2000);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_splash;
    }


    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }

    private class  MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {

            if (msg.what==2){
                startActivity(new Intent(SplashActivity.this, VideoPlayerActivity.class));
                finish();
            }
        }
    }
}
