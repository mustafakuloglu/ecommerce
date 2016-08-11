package gm.com.ecommerce.activities;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.checkout.MoviesAdapter;
import gm.com.ecommerce.models.Movie;
import gm.com.ecommerce.utils.DividerItemDecoration;

public class ActivityI extends AppCompatActivity {
    public RecyclerView recyclerView;
    public List<Movie> movieList;
    public MoviesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        BaseActivity tabActivity = new BaseActivity();
        tabActivity.drawerCreate(this,"Categories");
        mAdapter=new MoviesAdapter(movieList);
        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        movieList =new ArrayList<Movie>();
        movieList.add(new Movie("Category","35 products",R.drawable.cloud));
        movieList.add(new Movie("Category","12 products",R.drawable.cloud));
        movieList.add(new Movie("Category","38 products",R.drawable.cloud));
        movieList.add(new Movie("Category","147 products",R.drawable.cloud));
        movieList.add(new Movie("Category","8 products",R.drawable.cloud));
        movieList.add(new Movie("Category","29 products",R.drawable.cloud));
        movieList.add(new Movie("Category","41 products",R.drawable.cloud));
        movieList.add(new Movie("Category","2 products",R.drawable.cloud));
        movieList.add(new Movie("Category","2 products",R.drawable.cloud));

        MoviesAdapter adapter_items = new MoviesAdapter(movieList);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
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



    }
}
