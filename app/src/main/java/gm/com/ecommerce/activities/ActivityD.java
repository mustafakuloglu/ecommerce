package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentD;

public class ActivityD extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_b);
        tabCreate(new FragmentD(),null,null);
        drawerCreate(this,"My Store");
    }

}
