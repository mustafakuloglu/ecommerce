package gm.com.ecommerce.models;

import java.util.List;

/**
 * Created by Comert on 1.08.2016.
 */
public class PersonB {

    private String urun;
    private String lorem;
    private String dolar;
    private int navo;
    private int favo;
    private int icon;
    private int shoppin;
    public List<PersonB> movie_list;

    public String geturun() {
        return urun;
    }
    public String getlorem() {
        return lorem;
    }
    public String getdolar() {
        return dolar;
    }
    public int getnavo() {
        return navo;
    }
    public int getfavo() {
        return favo;
    }
    public int getshoppin() {
        return shoppin;
    }
    public int geticon() {
        return icon;
    }

    public PersonB(String urun, String lorem,String dolar, int icon,int shoppin,int favo,int navo)
    {
        this.urun=urun;
        this.lorem=lorem;
        this.dolar=dolar;
        this.icon=icon;
        this.shoppin=shoppin;
        this.favo=favo;
        this.navo=navo;

    }
}