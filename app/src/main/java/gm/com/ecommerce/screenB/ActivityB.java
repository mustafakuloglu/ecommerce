package gm.com.ecommerce.screenB;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.BaseActivity;

public class ActivityB extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_b);
        tabCreate(new FragmentB(),null,null);
        drawerCreate(this,"My Store");
    }
}
