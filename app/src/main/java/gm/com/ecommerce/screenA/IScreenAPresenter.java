package gm.com.ecommerce.screenA;

import android.view.View;

import java.util.List;

/**
 * Created by musta on 11.08.2016.
 */
public interface IScreenAPresenter {
    void onitemSelect(View v);
    List<ItemA> fillList();
}
