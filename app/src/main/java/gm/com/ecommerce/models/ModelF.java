package gm.com.ecommerce.models;

/**
 * Created by Comert on 4.08.2016.
 */
public class ModelF {

    private String urun;
    private String lorem;
    private int icon;
    private int navo;
    private int favo;
    private int shopping;

    public String geturun()
    {
        return this.urun;
    }
    public String getlorem()
    {
        return this.lorem;
    }
    public int geticon()
    {
        return this.icon;
    }
    public int getnavo()
    {
        return this.navo;
    }
    public int getfavo()
    {
        return this.favo;
    }
    public int getshopping()
    {
        return this.shopping;
    }

    public ModelF(String urun, String lorem, int icon,int navo,int favo,int shopping)
    {
        this.urun = urun;
        this.lorem = lorem;
        this.icon= icon;
        this.navo = navo;
        this.favo= favo;
        this.shopping = shopping;


    }


}



