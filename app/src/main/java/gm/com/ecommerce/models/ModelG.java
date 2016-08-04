package gm.com.ecommerce.models;

/**
 * Created by musta on 4.08.2016.
 */
public class ModelG {
    private String title;
    private String price;
    private int photo_id;

    public String getTitle()
    {
        return this.title;
    }
    public String getPrice()
    {
        return this.price;
    }
    public int getPhoto_id()
    {
        return this.photo_id;
    }

    public ModelG(String title, String price, int photo_id)
    {
        this.title = title;
        this.price = price;
        this.photo_id = photo_id;
    }


}
