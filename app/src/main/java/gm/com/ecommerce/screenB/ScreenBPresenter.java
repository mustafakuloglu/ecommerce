package gm.com.ecommerce.screenB;

import android.view.View;

import java.util.ArrayList;

import gm.com.ecommerce.R;

/**
 * Created by Comert on 12.08.2016.
 */
public class ScreenBPresenter implements IScreenBPresenter{
    IScreenBView screenBView;
    public ScreenBPresenter(IScreenBView screenBView) {
        this.screenBView = screenBView;
    }

    @Override
    public void onitemSelect(View v) {
        screenBView.onItemSelect(v);
    }

    @Override
    public ArrayList<PersonB> itemlist() {

        ArrayList<PersonB>itemlist=new ArrayList<>();
        itemlist.add(new PersonB("Product", "Lorem ipsum dolor sit amet consecteur adipiscing elit.","$100", R.drawable.icon1,R.drawable.ic_shopping_basket_black_24dp1,R.drawable.ic_favorite_black_24dp,R.drawable.ic_more_vert_black_24dp));
        itemlist.add(new PersonB("Product", "Lorem ipsum dolor sit amet consecteur adipiscing elit.","$100",R.drawable.icon1,R.drawable.ic_shopping_basket_black_24dp1,R.drawable.ic_favorite_black_24dp,R.drawable.ic_more_vert_black_24dp));

        return itemlist;
    }

    @Override
    public ArrayList<PersonB2> itemlist1() {
        ArrayList<PersonB2>itemlist1=new ArrayList<>();
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        itemlist1.add(new PersonB2("Product", "$100",R.drawable.iconsa,R.drawable.ic_more_vert_black_24dp));
        return itemlist1;
    }
}
