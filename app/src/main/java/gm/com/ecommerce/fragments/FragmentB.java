package gm.com.ecommerce.fragments;

/**
 * Created by Comert on 1.08.2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.adapters.FragmentB2adapter;
import gm.com.ecommerce.adapters.FragmentBadapter;
import gm.com.ecommerce.models.PersonB;
import gm.com.ecommerce.models.PersonB2;

/**
 * Created by Comert on 28.07.2016.
 */
public class FragmentB extends Fragment {
    private RecyclerView recycler_view;
    private RecyclerView recycler_view1;
    private List<PersonB> item_list;
    private List<PersonB2> item_list1;
    public FragmentBadapter mAdapter;
    public FragmentB2adapter mAdapter1;
    public FragmentB(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmentb, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_vie);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,1);

        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(mAdapter);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(mAdapter);
        item_list = new ArrayList<PersonB>();
        item_list.add(new PersonB("Product", "Lorem ipsum dolor sit amet consecteur adipiscing elit.","$100",R.drawable.icon1,R.drawable.ic_shopping_basket_black_24dp1,R.drawable.ic_favorite_black_24dp,R.drawable.ic_more_vert_black_24dp));
        item_list.add(new PersonB("Product", "Lorem ipsum dolor sit amet consecteur adipiscing elit.","$100",R.drawable.icon1,R.drawable.ic_shopping_basket_black_24dp1,R.drawable.ic_favorite_black_24dp,R.drawable.ic_more_vert_black_24dp));
        FragmentBadapter adapter_items = new FragmentBadapter(item_list);

        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());


        StaggeredGridLayoutManager layoutManager1 = new StaggeredGridLayoutManager(3,1);
        recycler_view1 = (RecyclerView)view.findViewById(R.id.recycler_view1);
        recycler_view1.setLayoutManager(layoutManager1);
        recycler_view1.setAdapter(mAdapter1);

        item_list1 = new ArrayList<PersonB2>();
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        item_list1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        FragmentB2adapter adapter_items1 = new FragmentB2adapter(item_list1);

       recycler_view1.setHasFixedSize(true);
        recycler_view1.setAdapter(adapter_items1);
        recycler_view1.setItemAnimator(new DefaultItemAnimator());
//        recycler_view.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
//
//            @Override
//            public void onTouchEvent(RecyclerView recycler, MotionEvent event) {
//
//            }
//
//            @Override
//            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//            }
//
//            @Override
//            public boolean onInterceptTouchEvent(RecyclerView recycler, MotionEvent event) {
//                return false;
//            }
//        });


        return view;


    }


}

