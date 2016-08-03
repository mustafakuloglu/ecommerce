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
import gm.com.ecommerce.adapters.ActivityNAdapter;
import gm.com.ecommerce.models.Item;

public class ActivityN extends AppCompatActivity {
    private RecyclerView recycler_view;
    private List<Item> item_list;
    BaseActivity baseActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_n);
        baseActivity =new BaseActivity();
        baseActivity.drawerCreate(this,"Category");
        baseActivity.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        recycler_view = (RecyclerView)findViewById(R.id.recycler_viewn);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<Item>();

        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",4f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",1f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",3f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",0f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",4f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",1f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",3f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",0f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",4f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",1f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",3f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",2f));
        item_list.add(new Item("Product", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", R.drawable.cloud,"$100",0f));

        ActivityNAdapter adapter_items = new ActivityNAdapter(item_list);

        recycler_view.setHasFixedSize(true);

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
