package gm.com.ecommerce.ScreenK;

/**
 * Created by Comert on 11.08.2016.
 */

public class ScreenKPresenter implements IScreenKPresenter ,IScreenKListener{
    IScreenKView view;
    IScreenKInteractor interactor;
    public ScreenKPresenter(IScreenKView view) {
        this.view=view;
        this.interactor = new ScreenKInteractorImpl();
        this.interactor.setScreenKListener(this);
    }

    @Override
    public void addbasketlist(String variants, String color) {

    }

    @Override
    public void addfavoritelist(String variants, String color) {

    }

    @Override
    public void onaddbasket() {

    }

    @Override
    public void onaddfavorite() {

    }

    @Override
    public void onviewall() {

    }

    @Override
    public void setScreenKListener(IScreenKListener screenKListener) {

    }
}
