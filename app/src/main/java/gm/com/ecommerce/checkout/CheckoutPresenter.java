package gm.com.ecommerce.checkout;

import java.util.ArrayList;

import gm.com.ecommerce.R;

/**
 * Created by Comert on 11.08.2016.
 */
public class CheckoutPresenter implements ICheckoutPresenter{

    ICheckoutView view;

    public CheckoutPresenter(ICheckoutView view) {
        this.view=view;}
    @Override
    public void Popup() {}

    @Override
    public ArrayList<MovieBasket> moviebasket() {
        ArrayList<MovieBasket>moviebasket = new ArrayList<>();
        moviebasket.add(new MovieBasket("Product","$100","1", R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        moviebasket.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        moviebasket.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));
        moviebasket.add(new MovieBasket("Product","$100","1",R.drawable.cloud,R.drawable.ic_expand_more_black_24dp,R.drawable.ic_expand_less_black_24dp));

        return moviebasket;
    }


}
