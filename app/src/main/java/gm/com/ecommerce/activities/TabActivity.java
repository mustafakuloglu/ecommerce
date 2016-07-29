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
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
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
        adapter.addfrag(new onefragment(),"Catagory");
        adapter.addfrag(new twofragment(),"Catagory");
        adapter.addfrag(new threefragment(),"Catagory");

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
    public void drawerCreate(Activity activity,String toolbarTitle) {
        final int[] positions = {1};
        toolbar=(Toolbar) activity.findViewById(R.id.tool_bar);

        toolbar.setTitle(toolbarTitle);
        new DrawerBuilder().withActivity(activity).build();
        final PrimaryDrawerItem item0 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);

        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(activity)
                .withHeaderBackground(R.drawable.drawer_header_bg_grey)
                .addProfiles(
                        new ProfileDrawerItem().withName("Material Mockups").withEmail("username@materialmockups.com").withIcon(R.drawable.drawer_circle)
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        return false;
                    }


                })
                .build();
        final Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .withSelectedItem(0)

                .addDrawerItems(
                        item0.withSelectedColor(0),
                        item1,
                        item2,
                        new SectionDrawerItem().withName(R.string.subheader),
                        item3,
                        item4
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D

//                        positions[0] =position;
//                          if(positions[0]==1)
//                            {item0.withIcon(R.drawable.item_icon_dark);
//                                item0.withName("değişti");
//                                item1.withIcon(R.drawable.item_icon);
//                                item1.withName(R.string.menu_name);
//                                item2.withIcon(R.drawable.item_icon);
//                                item2.withName(R.string.menu_name);
//                                item3.withIcon(R.drawable.item_icon);
//                                item3.withName(R.string.menu_name);
//                                item4.withIcon(R.drawable.item_icon);
//                                item4.withName(R.string.menu_name);
//                            }
//                            if(positions[0]==2)
//                            {item1.withIcon(R.drawable.item_icon_dark);
//                                item1.withName(R.string.menu_name_dark);
//                                item0.withIcon(R.drawable.item_icon);
//                                item0.withName("düzeldi");
//                                item2.withIcon(R.drawable.item_icon);
//                                item2.withName(R.string.menu_name);
//                                item3.withIcon(R.drawable.item_icon);
//                                item3.withName(R.string.menu_name);
//                                item4.withIcon(R.drawable.item_icon);
//                                item4.withName(R.string.menu_name);
//                            }
//                            if(positions[0]==3)
//                            {item2.withIcon(R.drawable.item_icon_dark);
//                                item2.withName("değişti");
//                                item1.withIcon(R.drawable.item_icon);
//                                item1.withName(R.string.menu_name);
//                                item0.withIcon(R.drawable.item_icon);
//                                item0.withName(R.string.menu_name);
//                                item3.withIcon(R.drawable.item_icon);
//                                item3.withName(R.string.menu_name);
//                                item4.withIcon(R.drawable.item_icon);
//                                item4.withName(R.string.menu_name);
//                            }
//
//                            if(positions[0]==5)
//                            {item3.withIcon(R.drawable.item_icon_dark);
//                                item3.withName(R.string.menu_name_dark);
//                                item1.withIcon(R.drawable.item_icon);
//                                item1.withName(R.string.menu_name);
//                                item2.withIcon(R.drawable.item_icon);
//                                item2.withName(R.string.menu_name);
//                                item0.withIcon(R.drawable.item_icon);
//                                item0.withName(R.string.menu_name);
//                                item4.withIcon(R.drawable.item_icon);
//                                item4.withName(R.string.menu_name);}
//                            if(positions[0]==6)
//                            {item4.withIcon(R.drawable.item_icon_dark);
//                                item4.withName(R.string.menu_name_dark);
//                                item1.withIcon(R.drawable.item_icon);
//                                item1.withName(R.string.menu_name);
//                                item2.withIcon(R.drawable.item_icon);
//                                item2.withName(R.string.menu_name);
//                                item3.withIcon(R.drawable.item_icon);
//                                item3.withName(R.string.menu_name);
//                                item0.withIcon(R.drawable.item_icon);
//                                item0.withName(R.string.menu_name);}



                        return false;}
                })

                .build();
    }
}