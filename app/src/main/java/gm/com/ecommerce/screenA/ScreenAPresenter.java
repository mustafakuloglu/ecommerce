package gm.com.ecommerce.screenA;

/**
 * Created by musta on 11.08.2016.
 */
public class ScreenAPresenter implements IScreenAPresenter {

   IScreenAView screenAView;

    public ScreenAPresenter(IScreenAView screenAView) {
        this.screenAView = screenAView;
    }

    @Override
    public void onitemSelect() {
screenAView.onItemSelect();
    }
}
