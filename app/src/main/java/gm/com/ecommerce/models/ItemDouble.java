package gm.com.ecommerce.models;

/**
 * Created by musta on 1.08.2016.
 */
public class ItemDouble {
    private String title;
    private String text;
    private int photo_id;
    private String price;
    private Float rate;
    private String title2;
    private String text2;
    private int photo_id2;
    private String price2;
    private Float rate2;

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
    public String getTitle2()
    {
        return this.title2;
    }
    public String getText2()
    {
        return this.text2;
    }
    public int getPhoto_id2()
    {
        return this.photo_id2;
    }
    public String getPrice2()
    {
        return this.price2;
    }
    public Float getRate2()
    {
        return this.rate2;
    }

    public ItemDouble(String title, String text, int photo_id,String price,Float rate,String title2, String text2, int photo_id2,String price2,Float rate2)
    {
        this.title = title;
        this.text = text;
        this.photo_id = photo_id;
        this.price=price;
        this.title2 = title2;
        this.text2 = text2;
        this.photo_id2 = photo_id2;
        this.price2=price2;
        this.rate=rate;
        this.rate2=rate2;
    }
}
