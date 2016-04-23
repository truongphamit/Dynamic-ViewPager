package com.example.truongpq.dynamicviewpager;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    public static Fragment newInstance(String title) {
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        myFragment.setArguments(args);
        return myFragment;
    }

    public MyFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        tvTitle.setText(getArguments().getString("title"));

        return view;
    }
}
