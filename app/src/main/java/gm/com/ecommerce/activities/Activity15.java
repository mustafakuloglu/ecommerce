package gm.com.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gm.com.ecommerce.R;

public class Activity15 extends AppCompatActivity {
TabActivity tabActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);
        tabActivity=new TabActivity();
        tabActivity.drawerCreate(this,"Form");
    }
}
