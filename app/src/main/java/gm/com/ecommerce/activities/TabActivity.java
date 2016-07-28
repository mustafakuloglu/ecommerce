package gm.com.ecommerce.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.onefragment;
import gm.com.ecommerce.fragments.threefragment;
import gm.com.ecommerce.fragments.twofragment;

public class TabActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public void tabCreate(){
        setContentView(R.layout.activity_tab);
        viewPager=(ViewPager)findViewById(R.id.viewpager);

        setupViewPager(viewPager);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(View viewpager)
    {
        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addfrag(new onefragment(),"Bir");
        adapter.addfrag(new twofragment(),"İki");
        adapter.addfrag(new threefragment(),"Üç");
        viewPager.setAdapter(adapter);


    }

    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragmentlist=new ArrayList<>();
        private final List<String> mFragmentTitlelist=new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager)
        {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentlist.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentlist.size();
        }
        public void addfrag(Fragment fragment,String title)
        {
            mFragmentlist.add(fragment);
            mFragmentTitlelist.add(title);

        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitlelist.get(position);
        }
    }
    public void drawerCreate(Activity activity) {

        toolbar=(Toolbar) activity.findViewById(R.id.tool_bar);
        new DrawerBuilder().withActivity(activity).build();
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName(R.string.app_name);
        SecondaryDrawerItem item2 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(2).withName(R.string.app_name);
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(activity)
                .withHeaderBackground(R.drawable.material_drawer_shadow_top)
                .addProfiles(
                        new ProfileDrawerItem().withName("Mike Penz").withEmail("mikepenz@gmail.com").withIcon(R.drawable.material_drawer_circle_mask)
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        return false;
                    }


                })
                .build();
        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        new SecondaryDrawerItem().withName(R.string.app_name)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return false;}
                })
                .build();
    }
}
