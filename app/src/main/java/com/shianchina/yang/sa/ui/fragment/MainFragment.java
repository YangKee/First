package com.shianchina.yang.sa.ui.fragment;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.shianchina.yang.sa.R;
import com.shianchina.yang.sa.api.bean.google.PlaceSearchResult;
import com.shianchina.yang.sa.presenter.impl.MainPresenter;
import com.shianchina.yang.sa.view.MainView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Yang on 2017/3/16.
 */

public class MainFragment extends BaseFragment implements MainView<PlaceSearchResult>{
    private String TAG ="MainFragment";
    @BindView(R.id.search_et)
    EditText mSearchEt;
    @BindView(R.id.search_btn)
    Button mSearchBtn;
    MainPresenter mMainPresenter;

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_main;

    }

    @Override
    protected void initViews() {

        mMainPresenter = new MainPresenter(getContext(),this);

    }


    @OnClick(R.id.search_btn)
    public void onClick() {
        Log.e("yy","onClick-------------");
        if (null==mSearchEt.getText()||("").equals(mSearchEt.getText().toString())){
            return;
        }
        mMainPresenter.doSearch(mSearchEt.getText().toString()+"");
    }

    @Override
    public void loadData(PlaceSearchResult d) {
        if (null!=d)
            Log.e("yy","loadData------d-------"+d.getResults().toString());
        else
            Log.e("yy","loadData------d-------null");
    }

    @Override
    public void showWaiteDialog(boolean isShow) {

    }

    @Override
    public void showMsg(String msg) {

    }


}
