package com.example.yoga;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PrincYogaAdapter extends FragmentPagerAdapter {
    PrincYogaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:return new PrinYoga1();
            case 1: return new PrinYoga2();
            case 3: return new PrincYoga3();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
