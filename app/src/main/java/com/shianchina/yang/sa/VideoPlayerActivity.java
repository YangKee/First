package com.shianchina.yang.sa;

import android.os.Bundle;
import android.view.KeyEvent;

import com.dl7.player.media.IjkPlayerView;
import com.shianchina.yang.sa.bean.VideoInfo;
import com.shianchina.yang.sa.ui.activity.BaseActivity;
import com.shianchina.yang.sa.ui.activity.BaseFragmentActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Yang on 2017/4/9.
 */

public class VideoPlayerActivity extends BaseFragmentActivity {
    @BindView(R.id.video_player)
    IjkPlayerView mVideoPlayer;

    private VideoInfo mVideoInfo;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_video_player;
    }

    @Override
    protected void initViews() {

        mVideoInfo = new VideoInfo();
        mVideoInfo.setTitle("袁腾飞《这个历史挺靠谱》");
        mVideoInfo.setMp4_url("http://flv2.bn.netease.com/videolib3/1501/28/wlncJ2098/SD/wlncJ2098-mobile.mp4");
        mVideoInfo.setMp4Hd_url("http://flv2.bn.netease.com/videolib3/1501/28/wlncJ2098/HD/wlncJ2098-mobile.mp4");

        mVideoPlayer.init()
                .setTitle(mVideoInfo.getTitle())
                .setVideoSource(null, mVideoInfo.getMp4_url(), mVideoInfo.getMp4Hd_url(), null, null);
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
    @Override
    protected void onResume() {
        super.onResume();
        mVideoPlayer.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mVideoPlayer.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mVideoPlayer.onDestroy();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mVideoPlayer.handleVolumeKey(keyCode)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (mVideoPlayer.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}
