package com.android.design.utils;

import android.widget.Toast;

import com.android.design.App;

public class ToastUtils {
    public static void show(String str){
        Toast.makeText(App.getContext(),str,Toast.LENGTH_LONG).show();
    }
}
