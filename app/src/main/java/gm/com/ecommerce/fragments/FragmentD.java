package gm.com.ecommerce.fragments;

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
import gm.com.ecommerce.adapters.FragdAdapter;
import gm.com.ecommerce.adapters.FragmentBadapter;
import gm.com.ecommerce.models.FragD;

/**
 * Created by Comert on 2.08.2016.
 */

/**
 * Created by Comert on 28.07.2016.
 */
public class FragmentD extends Fragment {
    private RecyclerView recycler_view;
    private List<FragD> item_list;
    public FragmentBadapter mAdapter;

    public FragmentD(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmentd, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_vie);


        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,1);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(mAdapter);
        item_list = new ArrayList<FragD>();
        item_list.add(new FragD("Product","$100",R.drawable.icon));
        item_list.add(new FragD("Product","$100",R.drawable.icon));
        item_list.add(new FragD("Product","$100",R.drawable.icon));
        item_list.add(new FragD("Product","$100",R.drawable.icon));

        FragdAdapter adapter_items = new FragdAdapter(item_list);

        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());




        return view;


    }


}
