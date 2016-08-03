package gm.com.ecommerce.activities;

import android.os.Bundle;

import gm.com.ecommerce.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseActivity baseActivity =new BaseActivity();
        tabCreate(null,null,null);
        baseActivity.drawerCreate(this,"My Store");


    }
}
