package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentB;

public class ActivityB extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_b);
        tabCreate(new FragmentB(),null,null);
        drawerCreate(this,"My Store");
    }
}
