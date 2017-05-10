package com.shianchina.yang.sa;

import android.content.res.Configuration;
import android.view.KeyEvent;
import android.widget.Button;

import com.dl7.player.media.IjkPlayerView;
import com.shianchina.yang.sa.bean.VideoInfo;
import com.shianchina.yang.sa.ui.activity.BaseFragmentActivity;

import butterknife.BindView;

/**
 * Created by Yang on 2017/4/9.
 */

public class VideoPlayerActivity extends BaseFragmentActivity {
    @BindView(R.id.video_player)
    IjkPlayerView mVideoPlayer;
    @BindView(R.id.download)
    Button mDownload;

    private VideoInfo mVideoInfo;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_video_player;
    }

    @Override
    protected void initViews() {

        mVideoInfo = new VideoInfo();
        mVideoInfo.setTitle("袁腾飞《这个历史挺靠谱》");
        mVideoInfo.setMp4_url("http://sazg.zhongcetianxia.com/video.mp4");
        mVideoInfo.setMp4Hd_url("http://sazg.zhongcetianxia.com/video.mp4");

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


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mVideoPlayer.configurationChanged(newConfig);
    }


//    @OnClick(R.id.download)
//    public void onViewClicked(View view) {
//        if (view.isSelected()) {
//            DialogHelper.checkDialog(this, mVideoData);
//        } else {
//            DialogHelper.downloadDialog(this, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DownloaderWrapper.start(mVideoData);
//                    mIvVideoDownload.setSelected(true);
//                    SnackbarUtils.showDownloadSnackbar(VideoPlayerActivity.this, "任务正在下载", true);
//                }
//            });
//        }
//    }
}
