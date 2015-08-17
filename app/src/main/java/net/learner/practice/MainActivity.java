package net.learner.practice;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    PagerAdapter pagerAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    public void onCompileButton() {
        Log.d("log", "compiling");
        viewPager.setCurrentItem(1);
    }

    public void onBackButton() {
        Log.d("log", "back");
        viewPager.setCurrentItem(0);
    }
}
