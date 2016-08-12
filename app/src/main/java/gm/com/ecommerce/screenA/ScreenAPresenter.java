package gm.com.ecommerce.screenA;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

import gm.com.ecommerce.R;

/**
 * Created by musta on 11.08.2016.
 */
public class ScreenAPresenter implements IScreenAPresenter {

   IScreenAView screenAView;

    public ScreenAPresenter(IScreenAView screenAView) {
        this.screenAView = screenAView;
    }

    @Override
    public void onitemSelect(View v) {
screenAView.onItemSelect(v);

    }

    @Override
    public List<ItemA> fillList() {
        List<ItemA> item_list=new ArrayList<>();

        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        item_list.add(new ItemA("Product", "$100", R.drawable.lanscape_icon));
        return item_list;
    }
}
