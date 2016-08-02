package gm.com.ecommerce.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.adapters.FragmentAAdapter;
import gm.com.ecommerce.models.ItemA;

/**
 * Created by musta on 2.08.2016.
 */
public class FragmentA extends Fragment {
    private RecyclerView recycler_view;
    private List<ItemA> item_list;



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_view_a);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<ItemA>();

        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));

        FragmentAAdapter adapter_items = new FragmentAAdapter(item_list);

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


        return view;
    }
}
