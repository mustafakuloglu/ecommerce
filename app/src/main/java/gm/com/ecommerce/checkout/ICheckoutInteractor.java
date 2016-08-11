package gm.com.ecommerce.checkout;

/**
 * Created by Comert on 11.08.2016.
 */
public interface ICheckoutInteractor {
    void onPopup();
    void setCheckoutListener(ICheckoutListener checkoutListener);
        }
