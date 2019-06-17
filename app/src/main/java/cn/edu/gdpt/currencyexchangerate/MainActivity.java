package cn.edu.gdpt.currencyexchangerate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdpt.currencyexchangerate.Tab.BlankFragment1;
import cn.edu.gdpt.currencyexchangerate.Tab.BlankFragment2;
import cn.edu.gdpt.currencyexchangerate.Tab.BlankFragment3;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    List<Fragment> fragmentList;
    ViewPager viewPager;

    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("汇率").setIcon(R.drawable.tab1));
        tabLayout.addTab(tabLayout.newTab().setText("牌价").setIcon(R.drawable.hist));
        tabLayout.addTab(tabLayout.newTab().setText("我").setIcon(R.drawable.tab3));

        fragmentList = new ArrayList<>();
        fragmentList.add(new BlankFragment1());
        fragmentList.add(new BlankFragment2());
        fragmentList.add(new BlankFragment3());

        MyFragmentAdapter myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.vp);
        viewPager.setAdapter(myFragmentAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                tabLayout.getTabAt(i).select();
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                for (int i = 0; i < tabLayout.getTabCount(); i++) {
                    if (tab == tabLayout.getTabAt(i)) viewPager.setCurrentItem(i);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private class MyFragmentAdapter extends FragmentPagerAdapter {

        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}
