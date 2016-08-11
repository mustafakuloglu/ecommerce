package gm.com.ecommerce.user;

/**
 * Created by musta on 11.08.2016.
 */
public class UserEventInteractorImpl implements IUserEventInteractor {
   private ISaveListener saveListener;
    private int save=0;
    @Override
    public void save() {
        save++;
        if(save%2==0){
            saveListener.onSaveSuccsess();
        }
        else{
            saveListener.onSaveFailed();
        }
    }

    @Override
    public void setSaveListener(ISaveListener saveListener) {
this.saveListener=saveListener;
    }
}
