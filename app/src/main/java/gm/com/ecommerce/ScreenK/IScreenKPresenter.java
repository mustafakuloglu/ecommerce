package gm.com.ecommerce.ScreenK;

import java.util.ArrayList;

import gm.com.ecommerce.models.ModelL;

/**
 * Created by Comert on 11.08.2016.
 */
public interface IScreenKPresenter {
    void Basketlist(int variants,int color);
    void Favoritelist(int variants,int color);
    ArrayList<ModelL> modelL();




}
