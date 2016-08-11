package gm.com.ecommerce.ScreenK;

/**
 * Created by Comert on 11.08.2016.
 */
public interface IScreenKInteractor {
    void addbasketlist(String variants,String color);
    void addfavoritelist(String variants,String color);
    void setScreenKListener(IScreenKListener screenKListener);


}
