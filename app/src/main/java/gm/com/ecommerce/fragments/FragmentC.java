package gm.com.ecommerce.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.adapters.FragmantCadapter;
import gm.com.ecommerce.models.ItemDouble;

/**
 * Created by Comert on 28.07.2016.
 */
public class FragmentC extends Fragment {
    private RecyclerView recycler_view;
    private List<ItemDouble> item_list;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_vie);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<ItemDouble>();

        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",4f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",2f));
        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",1f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",3f));
        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",2f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",0f));
        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",3f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",2f));
        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",3f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",2f));
        item_list.add(new ItemDouble("Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",3f,"Product", "Suspendisse lacinia velit a nibh volutpat ornare.", R.drawable.lanscape_icon,"$100",2f));

        FragmantCadapter adapter_items = new FragmantCadapter(item_list);

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
