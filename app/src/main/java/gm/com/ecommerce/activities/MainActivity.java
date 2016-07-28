package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabActivity tabActivity=new TabActivity();
        tabCreate();
        tabActivity.drawerCreate(this);

    }
}
