package gm.com.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gm.com.ecommerce.R;
public class ActivityK extends AppCompatActivity {
    BaseActivity baseActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_k);
        baseActivity = new BaseActivity();
        baseActivity.drawerCreate(this, "Category");
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
    }}