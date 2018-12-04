package com.android.design.factory.simple;

import android.widget.TextView;

import com.android.design.R;
import com.android.design.base.LazyFragment;

import butterknife.BindView;

public class FragmentA extends LazyFragment {
    @BindView(R.id.tv)
    TextView tv;
    @Override
    public int setFragmentView() {
        return R.layout.fragment_simple_factory_content;
    }

    @Override
    public void initViews() {
tv.setText("FragmentA");
    }

    @Override
    public void onFirstUserVisible() {

    }
}
