package gm.com.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import gm.com.ecommerce.R;
import gm.com.ecommerce.adapters.ActivityLCommentAdapter;
import gm.com.ecommerce.models.ModelL;
import gm.com.ecommerce.utils.ViewClick;

public class ActivityL extends AppCompatActivity {
    RecyclerView recycler_view;
    private List<ModelL> item_list;
    private ViewClick viewClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_l);
        BaseActivity baseActivity= new BaseActivity();
        baseActivity.drawerCreate(this,"Product");
        ButterKnife.bind(this);
        viewClick = new ViewClick(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recycler_view =(RecyclerView)findViewById(R.id.recycler_view_l);

        recycler_view.setLayoutManager(layoutManager);
        item_list = new ArrayList<ModelL>();
        item_list.add(new ModelL(3,"by username","2 hours ago","Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit. Donec quis nunc vel dolor tincidunt effiamet."));
        item_list.add(new ModelL(3,"by username","2 hours ago","Lorem ipsum dolor sit orem ipsum dolor sit amet."));
        item_list.add(new ModelL(3,"by username","2 hours ago","Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit.  f"));

        ActivityLCommentAdapter adapter_items=new ActivityLCommentAdapter(item_list);
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
    @OnClick(R.id.a_l_1)
    public void a1(){
        viewClick.click(1);
    }
    @OnClick(R.id.a_l_2)
    public void a2(){
        viewClick.click(2);
    }
    @OnClick(R.id.a_l_3)
    public void a3(){
        viewClick.click(3);
    }
    @OnClick(R.id.a_l_4)
    public void a4(){
        viewClick.click(4);
    }
    @OnClick(R.id.a_l_5)
    public void a5(){
        viewClick.click(5);
    }
    @OnClick(R.id.circle_1)
    public void circle_1(){
        viewClick.click(6);
    }
    @OnClick(R.id.circle_2)
    public void circle_2(){
        viewClick.click(7);
    }
    @OnClick(R.id.circle_3)
    public void circle_3(){
        viewClick.click(8);
    }
    @OnClick(R.id.circle_4)
    public void circle_4(){
        viewClick.click(9);
    }
}
