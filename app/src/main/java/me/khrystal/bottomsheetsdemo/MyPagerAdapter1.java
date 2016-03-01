package me.khrystal.bottomsheetsdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ASUS on 2016/2/18.
 */
public class MyPagerAdapter1 extends FragmentPagerAdapter {

    private ArrayList<String> titles;


    public MyPagerAdapter1(FragmentManager fm, ArrayList<String> list) {
        super(fm);
        this.titles = list;
        Bundle b = new Bundle();
        b.putString("title", "hahaha");
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle b = new Bundle();
        b.putString("title", titles.get(position));
        return FragmentContent.getInstance(b);
    }
}
