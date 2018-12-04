package com.android.design.factory.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.android.design.R;
import com.android.design.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleFactoryActivity extends BaseActivity {
    @BindView(R.id.vp)
    ViewPager vp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        vp.setAdapter(new SimplePagerAdapter(getSupportFragmentManager()));
    }

    public void goA(View view){
vp.setCurrentItem(0,false);
    }
    public void goB(View view){
        vp.setCurrentItem(1,false);
    }
}
