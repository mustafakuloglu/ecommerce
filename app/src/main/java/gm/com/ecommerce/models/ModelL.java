package gm.com.ecommerce.models;

/**
 * Created by musta on 4.08.2016.
 */
public class ModelL {
    private float rating;
    private String user;
    private String time;
    private String comment;
    public ModelL(float rating, String user, String time, String comment){
        this.rating=rating;
        this.user = user;
        this.time=time;
        this.comment=comment;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
