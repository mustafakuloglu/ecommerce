package gm.com.ecommerce.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.BaseActivity;

public class ActivityJ extends AppCompatActivity implements IUserEventView,View.OnClickListener {
BaseActivity baseActivity;
    ImageView shop,search;
    @BindView(R.id.button2)Button save;
    @BindView(R.id.button)Button back;
    @BindView(R.id.textView4)TextView text;
    private IUserEventPresenter userEventPresenter;
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
        ButterKnife.bind(this);
        save.setOnClickListener(this);
        back.setOnClickListener(this);
        userEventPresenter=new UserEventPresenter(this);
    }

    @Override
    public void onSaveSucces() {
        Toast.makeText(getApplicationContext(),"başarılı",Toast.LENGTH_SHORT);
        text.setText("başarılı");
    }

    @Override
    public void onSaveFailed() {
        Toast.makeText(getApplicationContext(),"başarılı",Toast.LENGTH_SHORT);
        text.setText("başarısız");

    }

    @Override
    public void onBackTouched() {
        text.setText("geri");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button2) {
            Toast.makeText(getApplicationContext(),"on click",Toast.LENGTH_SHORT);

            userEventPresenter.save();
        }
        if (view.getId() == R.id.button) {
         userEventPresenter.backPressed();
        }
    }
}
