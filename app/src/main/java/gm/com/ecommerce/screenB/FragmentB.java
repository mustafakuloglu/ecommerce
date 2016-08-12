package gm.com.ecommerce.screenB;

/**
 * Created by Comert on 1.08.2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.checkout.ActivityM;

/**
 * Created by Comert on 28.07.2016.
 */
public class FragmentB extends Fragment implements IScreenBView {
    private RecyclerView recycler_view;
    private RecyclerView recycler_view1;
    private List<PersonB> item_list;
    private List<PersonB2> item_list1;
    public FragmentBadapter mAdapter;
    public FragmentB2adapter mAdapter1;
    public FragmentB(){}
    IScreenBPresenter screenBPresenter;
    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragmentb, container, false);
        recycler_view = (RecyclerView)view.findViewById(R.id.recycler_vie);
        screenBPresenter=new ScreenBPresenter(this);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,1);

        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(mAdapter);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(mAdapter);
        FragmentBadapter adapter_items = new FragmentBadapter(screenBPresenter.itemlist());

        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());


        StaggeredGridLayoutManager layoutManager1 = new StaggeredGridLayoutManager(3,1);
        recycler_view1 = (RecyclerView)view.findViewById(R.id.recycler_view1);
        recycler_view1.setLayoutManager(layoutManager1);
        recycler_view1.setAdapter(mAdapter1);

        FragmentB2adapter adapter_items1 = new FragmentB2adapter(screenBPresenter.itemlist1());

       recycler_view1.setHasFixedSize(true);
        recycler_view1.setAdapter(adapter_items1);
        recycler_view1.setItemAnimator(new DefaultItemAnimator());

    adapter_items1.setOnItemClickListener(new FragmentB2adapter.ClickListener() {
        @Override
        public void onItemClick(final int position, View v) {
            ImageView im=(ImageView)view.findViewById(R.id.navos);
            if(im.getId()==v.getId())
            { PopupMenu pop = new PopupMenu(getActivity(),im);
                pop.getMenuInflater().inflate(R.menu.popup_menu,pop.getMenu());


                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {

                        Toast.makeText(getActivity(),"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();

                        return true;
                    }
                });

                pop.show();
                Toast.makeText(getActivity(), "Hello Guys", Toast.LENGTH_SHORT).show();
            }
            else{
                screenBPresenter.onitemSelect(v);
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
        Intent main=new Intent(getActivity(),ActivityM.class);
        getActivity().startActivity(main);
    }
}

