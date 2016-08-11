package gm.com.ecommerce.user;

/**
 * Created by musta on 11.08.2016.
 */
public class UserEventPresenter implements IUserEventPresenter,ISaveListener{
    IUserEventView view;
    IUserEventInteractor interactor;
    public UserEventPresenter(IUserEventView view) {
    this.view=view;
        interactor=new UserEventInteractorImpl();
        interactor.setSaveListener(this);

    }

    @Override
    public void save() {
        interactor.save();
    }

    @Override
    public void backPressed() {
view.onBackTouched();
    }

    @Override
    public void onSaveSuccsess() {
view.onSaveSucces();
    }

    @Override
    public void onSaveFailed() {
        view.onSaveFailed();
    }
}
