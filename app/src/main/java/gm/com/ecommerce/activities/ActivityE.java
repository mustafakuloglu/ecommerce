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
import gm.com.ecommerce.adapters.ActivityEAdapter;
import gm.com.ecommerce.models.Person;

public class ActivityE extends AppCompatActivity {
    private RecyclerView recycler_view;
    private List<Person> item_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_e);
        BaseActivity baseActivity =new BaseActivity();
        baseActivity.drawerCreate(this,"Catagories");
        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<Person>();

        item_list.add(new Person("Category", "23 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "9 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "276 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "276 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));
        item_list.add(new Person("Category", "18 products", R.drawable.lanscape_icon));


        ActivityEAdapter adapter_items = new ActivityEAdapter(item_list);

        recycler_view.setHasFixedSize(false);
        recycler_view.setHorizontalScrollBarEnabled(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());


        recycler_view.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

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
