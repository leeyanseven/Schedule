package com.example.albertli.schedule.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albertli.schedule.R;

/**
 * Project Name: Schedule
 * Details: 假期fragment
 * Created by albert.li on 2018/7/15.
 */


public class HolidayFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_holiday, null);
        return view;
    }
}
