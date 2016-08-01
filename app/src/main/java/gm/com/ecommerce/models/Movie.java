package gm.com.ecommerce.models;

import java.util.List;

/**
 * Created by Comert on 29.07.2016.
 */
public class Movie {
    private String name;
    private String products;
    private int photo_id;
    public List<Movie> movie_list;

    public String getName() {
        return name;
    }
    public String getProducts() {
        return products;
    }

    public int getPhoto_id() {
        return photo_id;
    }

    public Movie(String name, String products, int photo_id)
    {
        this.name=name;
        this.products=products;
        this.photo_id=photo_id;
    }
}
