package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;
import gm.com.ecommerce.fragments.FragmentG;

/**
 * Created by musta on 4.08.2016.
 */
public class ActivityG extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_g);
        tabCreate(new FragmentG(),null,null);
        drawerCreate(this,"My Store");

    }
}
