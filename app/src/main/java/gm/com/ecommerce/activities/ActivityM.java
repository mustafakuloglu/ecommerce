package gm.com.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.adapters.BasketAdapter;
import gm.com.ecommerce.models.MovieBasket;
import gm.com.ecommerce.utils.DividerItemDecoration;

public class ActivityM extends AppCompatActivity {
    BaseActivity baseActivity;
    ImageView shop,search;
    public RecyclerView recyclerView;
    public List<MovieBasket> movieList;
    public BasketAdapter mAdapter;
    private Button button;

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

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MaterialDialog dialog = new MaterialDialog.Builder(ActivityM.this)
                        .title("Your Basket")
                        .positiveText("OK")
                        .customView(R.layout.activity_activity_m,false)
                        .show();


            }
        });


        mAdapter=new BasketAdapter(movieList);
        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        movieList =new ArrayList<MovieBasket>();
        movieList.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        movieList.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        movieList.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        movieList.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));

        BasketAdapter adapter_items = new BasketAdapter(movieList);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setAdapter(adapter_items);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

            @Override
            public void onTouchEvent(RecyclerView recycler, MotionEvent event) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }

            @Override
            public boolean onInterceptTouchEvent(RecyclerView recycler, MotionEvent event) {
                return false;
            }
        });


}}