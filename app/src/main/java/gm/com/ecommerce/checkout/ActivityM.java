package gm.com.ecommerce.checkout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.BaseActivity;
import gm.com.ecommerce.adapters.BasketAdapter;

public class ActivityM extends AppCompatActivity implements ICheckoutView,View.OnClickListener {
    BaseActivity baseActivity;
    ImageView shop,search;
    public RecyclerView recyclerView;
    public List<MovieBasket> movieList;
    public BasketAdapter mAdapter;
    @BindView(R.id.button3)Button check;
    private CheckoutPresenter checkoutPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_m);
        baseActivity =new BaseActivity();
        shop=(ImageView)findViewById(R.id.shop);
        search=(ImageView)findViewById(R.id.search);
        baseActivity.drawerCreate(this,"Your Basket");
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        shop.setVisibility(View.GONE);
        search.setVisibility(View.GONE);
        ButterKnife.bind(this);
        check.setOnClickListener(this);
        checkoutPresenter=new CheckoutPresenter(this);



        mAdapter=new BasketAdapter(checkoutPresenter.moviebasket());
        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        BasketAdapter adapter_items = new BasketAdapter(checkoutPresenter.moviebasket());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setAdapter(adapter_items);
        recyclerView.setItemAnimator(new DefaultItemAnimator());}

    @Override
    public void Popup() {

        final MaterialDialog dialog = new MaterialDialog.Builder(ActivityM.this)
                    .title("Your Basket")
                    .customView(R.layout.dialog_recyleview,true)
                    .autoDismiss(false)
                    .show();
            Button button=(Button)dialog.findViewById(R.id.checkout);
            recyclerView= (RecyclerView) dialog.findViewById(R.id.recycler_view);
            LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);

            BasketAdapter adapter_items = new BasketAdapter(checkoutPresenter.moviebasket());

            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(mAdapter);
            recyclerView.setAdapter(adapter_items);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(ActivityM.this, "Alışveriş Tamamlandı", Toast.LENGTH_LONG).show();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.run();

            onBackPressed();
        }
    });




    }
    @Override
    public void onClick(View view) {
       if (view.getId() == R.id.button3)
        {
            Popup();
        }

    }
}