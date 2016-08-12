package gm.com.ecommerce.ScreenK;

import java.util.ArrayList;

import gm.com.ecommerce.models.ModelL;

/**
 * Created by Comert on 11.08.2016.
 */

public class ScreenKPresenter implements IScreenKPresenter{
    IScreenKView view;
    public ScreenKPresenter(IScreenKView view) {
        this.view=view;
    }

    @Override
    public void Basketlist(int variants, int color) {
    }

    @Override
    public void Favoritelist(int variants, int color) {

    }

    @Override
    public ArrayList<ModelL> modelL() {
        ArrayList<ModelL>modelL=new ArrayList<>();
        modelL.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit. Donec quis nunc vel dolor tincidunt effiamet."));
        modelL.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet."));
        modelL.add(new ModelL(3, "by username", "2 hours ago", "Lorem ipsum dolor sit orem ipsum dolor sit amet, consectetur adipiscing elit.  f"));

        return modelL;
    }
}
