package gm.com.ecommerce.ScreenK;

/**
 * Created by Comert on 11.08.2016.
 */
public interface IScreenKListener {
    void onaddbasket();
    void onaddfavorite();
    void onviewall();
    void setScreenKListener(IScreenKListener screenKListener);
}
