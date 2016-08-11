package gm.com.ecommerce.checkout;

/**
 * Created by Comert on 11.08.2016.
 */
public class CheckoutPresenter implements ICheckoutPresenter,ICheckoutListener {

    ICheckoutView view;
    ICheckoutInteractor interactor;

    public CheckoutPresenter(ICheckoutView view) {
        this.view=view;
        interactor=new CheckoutInteactorImpl();
        interactor.setCheckoutListener(this);

    }


    @Override
    public void onPopup() {
interactor.onPopup();
    }

}
