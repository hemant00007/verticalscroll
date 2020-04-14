package com.example.verticalscrolling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private VerticalViewPager viewPager;
    private ViewPagerAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (VerticalViewPager)findViewById(R.id.viewPager);
        viewAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewAdapter);

    }
}
