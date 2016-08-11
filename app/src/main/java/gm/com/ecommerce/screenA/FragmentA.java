package gm.com.ecommerce.screenA;

import android.content.Intent;
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
import gm.com.ecommerce.activities.ActivityL;

/**
 * Created by musta on 2.08.2016.
 */
public class FragmentA extends Fragment implements IScreenAView,View.OnClickListener {
    private RecyclerView recycler_view;
    private List<ItemA> item_list;

IScreenAPresenter screenAPresenter;

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
screenAPresenter=new ScreenAPresenter(this);
        recycler_view.setLayoutManager(layoutManager);

        item_list = new ArrayList<ItemA>();

        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));

        FragmentAAdapter adapter_items = new FragmentAAdapter(item_list,getActivity(),this);

        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());
recycler_view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});


        return view;
    }

    @Override
    public void onItemSelect() {
        Intent main=new Intent(getActivity(),ActivityL.class);
        getActivity().startActivity(main);
    }

    @Override
    public void onClick(View view) {

    }
}
