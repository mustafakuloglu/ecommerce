package gm.com.ecommerce.user;

/**
 * Created by musta on 11.08.2016.
 */
public interface IUserEventInteractor {
    void save();
    void setSaveListener(ISaveListener saveListener);
}

