package gm.com.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import gm.com.ecommerce.R;

public class ActivityJ extends AppCompatActivity {
BaseActivity baseActivity;
    ImageView shop,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);
        baseActivity =new BaseActivity();
        shop=(ImageView)findViewById(R.id.shop);
        search=(ImageView)findViewById(R.id.search);
        baseActivity.drawerCreate(this,"Form");
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        shop.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
    }
}
