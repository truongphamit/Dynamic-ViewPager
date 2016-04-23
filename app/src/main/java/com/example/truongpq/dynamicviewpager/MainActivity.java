package com.example.truongpq.dynamicviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        List<MyFragment> fragments = new ArrayList<>();
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 1"));
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 2"));
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 3"));
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 4"));
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 5"));
        fragments.add((MyFragment) MyFragment.newInstance("Fragment 6"));

        adapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
    }
}
