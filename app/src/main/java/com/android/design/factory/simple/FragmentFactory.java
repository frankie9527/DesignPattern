package com.android.design.factory.simple;

import android.util.SparseArray;

import com.android.design.base.LazyFragment;

public class FragmentFactory {
    public static SparseArray<LazyFragment> fragmentSparseArray = new SparseArray<>();
    public static LazyFragment creatFragment(int postion) {
        LazyFragment currentFragment = fragmentSparseArray.get(postion);
        if (currentFragment == null) {
            switch (postion) {
                case 0:
                    fragmentSparseArray.put(0, new FragmentA());
                    break;
                case 1:
                    fragmentSparseArray.put(1, new FragmentB());
                    break;
                default:
                    break;
            }
            currentFragment=fragmentSparseArray.get(postion);
        }
        return currentFragment;
    }
}
