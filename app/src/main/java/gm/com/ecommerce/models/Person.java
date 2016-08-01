package gm.com.ecommerce.models;

/**
 * Created by musta on 1.08.2016.
 */
public class Person {

    private String title;
    private String text;
    private int photo_id;

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

    public Person(String title, String text, int photo_id)
    {
        this.title = title;
        this.text = text;
        this.photo_id = photo_id;
    }
    public Person()
    {

    }


}