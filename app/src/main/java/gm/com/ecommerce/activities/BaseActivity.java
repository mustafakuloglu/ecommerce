package gm.com.ecommerce.activities;

import android.app.Activity;
import android.content.Intent;
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
import gm.com.ecommerce.screenA.ActivityA;
import gm.com.ecommerce.checkout.ActivityM;
import gm.com.ecommerce.fragments.onefragment;
import gm.com.ecommerce.fragments.threefragment;
import gm.com.ecommerce.fragments.twofragment;
import gm.com.ecommerce.user.ActivityJ;

public class BaseActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    public Toolbar toolbar;
    Activity activity=new Activity();
    int id= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void  tabCreate(Fragment f1,Fragment f2,Fragment f3){
        setContentView(R.layout.activity_tab);
        viewPager=(ViewPager)findViewById(R.id.viewpager);

        setupViewPager(viewPager,f1,f2,f3);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(View viewpager,Fragment f1,Fragment f2,Fragment f3)
    {
        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());
        if(f1==null) {
            adapter.addfrag(new onefragment(), "Category");
        }
        else{
            adapter.addfrag(f1,"Catagory");
        }
        if(f2==null) {
            adapter.addfrag(new twofragment(), "Category");
        }
        else{
            adapter.addfrag(f2,"");
        }
        if(f3==null) {
            adapter.addfrag(new threefragment(), "Category");
        }
        else{
            adapter.addfrag(f3,"");
        }

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
    public void drawerCreate(final Activity activity, String toolbarTitle) {
        this.activity=activity;
        final int[] positions = {1};
        toolbar=(Toolbar) activity.findViewById(R.id.tool_bar);

        toolbar.setTitle(toolbarTitle);
        new DrawerBuilder().withActivity(activity).build();
        final PrimaryDrawerItem item0 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(2).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(3).withName("Menu item").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemE = new PrimaryDrawerItem().withIdentifier(4).withName("Activity E").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemJ = new PrimaryDrawerItem().withIdentifier(5).withName("Activity J").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemC = new PrimaryDrawerItem().withIdentifier(7).withName("Activity C").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemI = new PrimaryDrawerItem().withIdentifier(6).withName("Activity I").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemM = new PrimaryDrawerItem().withIdentifier(8).withName("Activity M").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemN = new PrimaryDrawerItem().withIdentifier(9).withName("Activity N").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemB = new PrimaryDrawerItem().withIdentifier(10).withName("Activity B").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemD = new PrimaryDrawerItem().withIdentifier(11).withName("Activity D").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
       final PrimaryDrawerItem itemA = new PrimaryDrawerItem().withIdentifier(12).withName("Activity A").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemG = new PrimaryDrawerItem().withIdentifier(13).withName("Activity G").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemF = new PrimaryDrawerItem().withIdentifier(14).withName("Activity F").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemL = new PrimaryDrawerItem().withIdentifier(15).withName("Activity L").withIcon(R.drawable.item_icon)
                .withTextColorRes(R.color.menu_light).withSelectedTextColorRes(R.color.menu_dark_selected).withSelectedIcon(R.drawable.item_icon_dark);
        final PrimaryDrawerItem itemK = new PrimaryDrawerItem().withIdentifier(16).withName("Activity K").withIcon(R.drawable.item_icon)
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
                        itemA,
                        itemB,
                        itemC,
                        itemD,
                        itemE,
                        itemF,
                        itemG,
                        itemI,
                        itemJ,
                        itemK,
                        itemL,
                        itemM,
                        itemN
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        id= (int) drawerItem.getIdentifier();
                        startScreen();
                    return false;}
                })

                .build();
    }
    public void startScreen()
    {
        if(id==4)
        { Intent main=new Intent(activity,ActivityE.class);
            activity.startActivity(main);}
        if(id==5)
        { Intent main=new Intent(activity,ActivityJ.class);
            activity.startActivity(main);}
        if(id==7)
        { Intent main=new Intent(activity,ActivityC.class);
            activity.startActivity(main);}
        if(id==6)
        { Intent main=new Intent(activity,ActivityI.class);
            activity.startActivity(main);}
        if(id==8)
        { Intent main=new Intent(activity,ActivityM.class);
            activity.startActivity(main);}
        if(id==9)
        { Intent main=new Intent(activity,ActivityN.class);
            activity.startActivity(main);}
        if(id==10)
        { Intent main=new Intent(activity,ActivityB.class);
            activity.startActivity(main);}
        if(id==11)
        { Intent main=new Intent(activity,ActivityD.class);
            activity.startActivity(main);}
        if(id==12)
        { Intent main=new Intent(activity,ActivityA.class);
            activity.startActivity(main);}
        if(id==13)
        { Intent main=new Intent(activity,ActivityG.class);
            activity.startActivity(main);}
        if(id==14)
        { Intent main=new Intent(activity,ActivityF.class);
            activity.startActivity(main);}
        if(id==15)
        { Intent main=new Intent(activity,ActivityL.class);
            activity.startActivity(main);}
        if(id==16)
        { Intent main=new Intent(activity,ActivityK.class);
            activity.startActivity(main);}
    }


}
