package gm.com.ecommerce.models;

/**
 * Created by musta on 1.08.2016.
 */
public class Item{
    private String title;
    private String text;
    private int photo_id;
    private String price;
    private Float rate;

    public String getTitle()
    {
        return this.title;
    }
    public String getText()
    {
        return this.text;
    }
    public int getPhoto_id()
    {
        return this.photo_id;
    }
    public String getPrice()
    {
        return this.price;
    }
    public Float getRate()
    {
        return this.rate;
    }

    public Item(String title, String text, int photo_id,String price,Float rate)
    {
        this.title = title;
        this.text = text;
        this.photo_id = photo_id;
        this.price=price;
        this.rate=rate;

    }
}
