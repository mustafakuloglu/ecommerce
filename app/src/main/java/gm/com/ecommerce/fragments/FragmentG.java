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
import gm.com.ecommerce.adapters.FragmentGAdapter;
import gm.com.ecommerce.models.ModelG;

/**
 * Created by musta on 4.08.2016.
 */
public class FragmentG extends Fragment {
    private RecyclerView recycler_view,recycler_view2;
    private List<ModelG> item_list;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_g, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_view_g);
        recycler_view2 = (RecyclerView)view.findViewById(R.id.recycler_view_g2);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        StaggeredGridLayoutManager layoutManager2 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        recycler_view.setLayoutManager(layoutManager);
        recycler_view2.setLayoutManager(layoutManager2);

        item_list = new ArrayList<ModelG>();

        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ModelG("Product", "$100", R.drawable.lanscape_icon));

        FragmentGAdapter adapter_items = new FragmentGAdapter(item_list);

        recycler_view.setHasFixedSize(true);
        recycler_view2.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);
        recycler_view2.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view2.setItemAnimator(new DefaultItemAnimator());


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
        recycler_view2.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

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
