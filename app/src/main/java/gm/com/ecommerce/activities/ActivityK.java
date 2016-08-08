package gm.com.ecommerce.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentK;
import me.relex.circleindicator.CircleIndicator;


public class ActivityK extends AppCompatActivity {
    MyPagerAdapter adapterViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_k);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(vpPager);
        adapterViewPager.registerDataSetObserver(indicator.getDataSetObserver());
        BaseActivity baseActivity = new BaseActivity();
        baseActivity.drawerCreate(this,"");
        baseActivity.toolbar.setBackgroundResource(R.color.activity_e_card_bg);
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            baseActivity.toolbar.setElevation( 0.1f);
        }
    }


    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 4;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FragmentK.newInstance(0, "Page # 1",R.drawable.icon);
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return FragmentK.newInstance(1, "Page # 2",R.drawable.icon);
                case 2: // Fragment # 1 - This will show SecondFragment
                    return FragmentK.newInstance(2, "Page # 3",R.drawable.icon);
                case 3: // Fragment # 1 - This will show SecondFragment
                    return FragmentK.newInstance(3, "Page # 3",R.drawable.icon);

                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }

}
