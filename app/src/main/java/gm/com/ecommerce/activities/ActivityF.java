package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentF;

public class ActivityF extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity_f);
        tabCreate(new FragmentF(),null,null);
        drawerCreate(this,"My Store");
    }

}
