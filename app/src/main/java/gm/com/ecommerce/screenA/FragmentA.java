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
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.activities.ActivityL;

/**
 * Created by musta on 2.08.2016.
 */
public class FragmentA extends Fragment implements IScreenAView {
    private RecyclerView recycler_view;
    private List<ItemA> item_list;

IScreenAPresenter screenAPresenter;
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_a, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_view_a);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        screenAPresenter=new ScreenAPresenter(this);
        recycler_view.setLayoutManager(layoutManager);
        FragmentAAdapter adapter_items = new FragmentAAdapter(screenAPresenter.fillList(),getActivity(),this );

        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());

adapter_items.setOnItemClickListener(new FragmentAAdapter.ClickListener() {
    @Override
    public void onItemClick(int position, View v) {

        ImageView im=(ImageView)view.findViewById(R.id.imageView_a);
        if(im.getId()==v.getId())
        {
            Toast.makeText(getActivity(), "dfvs", Toast.LENGTH_SHORT).show();
        }
        else
        {screenAPresenter.onitemSelect(v);

        }

    }

    @Override
    public void onItemLongClick(int position, View v) {

    }
});

        return view;
    }

    @Override
    public void onItemSelect(View v) {
        Intent main=new Intent(getActivity(),ActivityL.class);
        getActivity().startActivity(main);

    }

}
