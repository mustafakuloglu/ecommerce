package gm.com.ecommerce.models;

/**
 * Created by Comert on 2.08.2016.
 */
public class FragD {

    private String urun;
    private String lorem;
    private int icon;

    public String geturun()
    {
        return this.urun;
    }
    public String getLorem()
    {
        return this.lorem;
    }
    public int geticon()
    {
        return this.icon;
    }

    public FragD(String urun, String lorem, int icon)
    {
        this.urun = urun;
        this.lorem = lorem;
        this.icon = icon;
    }
    public FragD()
    {

    }


}