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
import gm.com.ecommerce.adapters.AdapterF;
import gm.com.ecommerce.models.ModelF;

/**
 * Created by Comert on 2.08.2016.
 */

/**
 * Created by Comert on 28.07.2016.
 */
public class FragmentF extends Fragment {
    private RecyclerView recycler_view;
    private List<ModelF> item_list;
    public AdapterF mAdapter;

    public FragmentF(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmentf, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_view_f);


        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<ModelF>();
        item_list.add(new ModelF("Product","$100",R.drawable.resf1,R.drawable.ic_shopping_basket_black_24dp2,R.drawable.ic_favorite_black_24dp1,R.drawable.ic_more_vert_black_24dp1));
        item_list.add(new ModelF("Product","$100",R.drawable.resf1,R.drawable.ic_shopping_basket_black_24dp2,R.drawable.ic_favorite_black_24dp1,R.drawable.ic_more_vert_black_24dp1));
        item_list.add(new ModelF("Product","$100",R.drawable.resf1,R.drawable.ic_shopping_basket_black_24dp2,R.drawable.ic_favorite_black_24dp1,R.drawable.ic_more_vert_black_24dp1));
        item_list.add(new ModelF("Product","$100",R.drawable.resf1,R.drawable.ic_shopping_basket_black_24dp2,R.drawable.ic_favorite_black_24dp1,R.drawable.ic_more_vert_black_24dp1));

        AdapterF adapter_items = new AdapterF(item_list);

        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());




        return view;


    }


}
