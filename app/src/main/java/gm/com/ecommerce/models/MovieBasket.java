package gm.com.ecommerce.models;

import java.util.List;

/**
 * Created by Comert on 1.08.2016.
 */
public class MovieBasket {
    private String name;
    private String products;
    private String counter;
    private int photo_id;
    private int photo_id2;
    private int photo_id1;
    public List<MovieBasket> movie_list;

    public String getName() {
        return name;
    }
    public String getCounter() {
        return counter;
    }
    public String getProducts() {
        return products;
    }
    public int getPhoto_id1() {
        return photo_id1;
    }
    public int getPhoto_id2() {
        return photo_id2;
    }
    public int getPhoto_id() {
        return photo_id;
    }

    public MovieBasket(String name, String products,String counter, int photo_id,int photo_id1,int photo_id2)
    {
        this.name=name;
        this.products=products;
        this.counter=counter;
        this.photo_id=photo_id;
        this.photo_id1=photo_id1;
        this.photo_id2=photo_id2;

    }
}
