package gm.com.ecommerce.screenA;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.BaseActivity;

public class ActivityA extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_a);
        tabCreate(new FragmentA(),null,null);
        drawerCreate(this,"My Store");

    }
}
