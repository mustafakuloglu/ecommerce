package gm.com.ecommerce.ScreenK;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.BaseActivity;
import gm.com.ecommerce.adapters.ActivityLCommentAdapter;
import gm.com.ecommerce.fragments.FragmentK;
import gm.com.ecommerce.models.ModelL;
import me.relex.circleindicator.CircleIndicator;


public class ActivityK extends AppCompatActivity implements IScreenKView, View.OnClickListener {
    MyPagerAdapter adapterViewPager;
    RecyclerView recycler_view;
    ArrayList<String> variantlist = new ArrayList<String>();
    ArrayList<String> colorlist = new ArrayList<String>();
    private List<ModelL> item_list;
    @BindView(R.id.activityk_favorite)
    Button favorite;
    @BindView(R.id.activityk_basket)
    Button basket;
    @BindView(R.id.activityk_view)
    Button viewall;
    @BindView(R.id.lin_2_l)
    RadioGroup radioGroup;
    @BindView(R.id.lin_3_l)
    RadioGroup radioGroupcolor;
    private IScreenKPresenter screenkpresenter;

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
        baseActivity.drawerCreate(this, "");
        baseActivity.toolbar.setBackgroundResource(R.color.activity_e_card_bg);
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            baseActivity.toolbar.setElevation(0.1f);
        }

        ButterKnife.bind(this);
        basket.setOnClickListener(this);
        favorite.setOnClickListener(this);
        viewall.setOnClickListener(this);
        screenkpresenter = new ScreenKPresenter(this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view_5);

        recycler_view.setLayoutManager(layoutManager);
        item_list = new ArrayList<ModelL>();
        item_list.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit. Donec quis nunc vel dolor tincidunt effiamet."));
        item_list.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet."));
        item_list.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit.  f"));

        ActivityLCommentAdapter adapter_items = new ActivityLCommentAdapter(item_list);
        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onaddbasket() {
        int secilenRadiovailant = radioGroup.getCheckedRadioButtonId();
        int secilenRadiocolor = radioGroupcolor.getCheckedRadioButtonId();
        switch (secilenRadiovailant) {
            case R.id.radiobutonA: {
                variantlist.add("A");
                break;
            }
            case R.id.radiobutonB: {
                variantlist.add("B");

                break;
            }
            case R.id.radiobutonC: {
                variantlist.add("C");

                break;
            }
            case R.id.radiobutonD: {
                variantlist.add("D");

                break;
            }
            case R.id.radiobutonE: {
                variantlist.add("E");

                break;
            }
        }

        switch (secilenRadiocolor) {
            case R.id.lightgray: {
                colorlist.add("Lightgray");
                break;
            }
            case R.id.gray: {
                colorlist.add("Gray");

                break;
            }
            case R.id.lightdarkgray: {
                colorlist.add("Lightdarkgray");

                break;
            }
            case R.id.darkgray: {
                colorlist.add("Darkgray");

                break;
            }
        }







    }

    @Override
    public void onaddfavorite() {
        onaddbasket();
    }

    @Override
    public void onviewall() {

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.activityk_basket) {
            onaddbasket();
            Toast.makeText(ActivityK.this,String.valueOf(variantlist.toString())+" "+String.valueOf(colorlist)+" "+"sepete eklendi",Toast.LENGTH_LONG).show();
            colorlist.clear();
            variantlist.clear();
        }

        if (view.getId() == R.id.activityk_favorite) {
            onaddbasket();
            Toast.makeText(ActivityK.this,String.valueOf(variantlist.toString())+" "+String.valueOf(colorlist)+" "+"favoriler eklendi",Toast.LENGTH_LONG).show();
            colorlist.clear();
            variantlist.clear();
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
                    return FragmentK.newInstance(0, "Page # 1", R.drawable.icon);
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return FragmentK.newInstance(1, "Page # 2", R.drawable.icon);
                case 2: // Fragment # 1 - This will show SecondFragment
                    return FragmentK.newInstance(2, "Page # 3", R.drawable.icon);
                case 3: // Fragment # 1 - This will show SecondFragment
                    return FragmentK.newInstance(3, "Page # 3", R.drawable.icon);

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
