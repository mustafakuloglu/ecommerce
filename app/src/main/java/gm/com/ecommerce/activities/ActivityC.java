package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentC;

public class ActivityC extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_c);
        tabCreate(new FragmentC(),null,null);
        drawerCreate(this,"My Store");

    }
}
