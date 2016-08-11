package gm.com.ecommerce.checkout;

/**
 * Created by Comert on 11.08.2016.
 */
public class CheckoutInteactorImpl implements ICheckoutInteractor{
    private ICheckoutListener checkoutListener;

    @Override
    public void onPopup() {}
    @Override
    public void setCheckoutListener(ICheckoutListener checkoutListener) {
        this.checkoutListener=checkoutListener;
    }
}
