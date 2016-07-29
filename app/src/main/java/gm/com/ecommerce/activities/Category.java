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

public class Category extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        TabActivity tabActivity = new TabActivity();
        tabActivity.drawerCreate(this,"Catagory");

        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);
        personList=new ArrayList<Person>();
        personList.add(new Person("Category","35 products",R.drawable.cloud));
        personList.add(new Person("Category","12 products",R.drawable.cloud));
        personList.add(new Person("Category","38 products",R.drawable.cloud));
        personList.add(new Person("Category","147 products",R.drawable.cloud));
        personList.add(new Person("Category","8 products",R.drawable.cloud));
        personList.add(new Person("Category","29 products",R.drawable.cloud));
        personList.add(new Person("Category","41 products",R.drawable.cloud));
        personList.add(new Person("Category","2 products",R.drawable.cloud));
        personList.add(new Person("Category","2 products",R.drawable.cloud));

        SimpleRecyclerAdapter adapter_items = new SimpleRecyclerAdapter(personList);

        recyclerView.setHasFixedSize(true);

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
