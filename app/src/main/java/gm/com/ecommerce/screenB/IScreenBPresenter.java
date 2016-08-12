package gm.com.ecommerce.screenB;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by Comert on 12.08.2016.
 */
public interface IScreenBPresenter {
    void onitemSelect(View v);
    ArrayList<PersonB>itemlist();
    ArrayList<PersonB2>itemlist1();
}
