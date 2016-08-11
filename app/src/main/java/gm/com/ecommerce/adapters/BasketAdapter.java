package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.checkout.MovieBasket;

/**
 * Created by Comert on 1.08.2016.
 */
public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView person_name;
        public TextView person_age;
        public TextView counter_name;
        public ImageView person_img;
        public ImageView person_img1;
        public ImageView person_img2;



        public ViewHolder(View view) {
            super(view);
            person_name = (TextView)view.findViewById(R.id.person_name);
            person_age = (TextView)view.findViewById(R.id.person_age);
            counter_name = (TextView)view.findViewById(R.id.counter);
            person_img = (ImageView)view.findViewById(R.id.person_photo);
            person_img1 = (ImageView)view.findViewById(R.id.person_photo1);
            person_img2 = (ImageView)view.findViewById(R.id.person_photo2);

        }
    }

    List<MovieBasket> list_movie;
    public BasketAdapter(List<MovieBasket> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public BasketAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.basketrescyleview, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(BasketAdapter.ViewHolder holder, int position) {
        MovieBasket movie = list_movie.get(position);
        holder.person_name.setText(movie.getName());
        holder.person_age.setText(movie.getProducts());
        holder.counter_name.setText(movie.getCounter());
        holder.person_img.setImageResource(movie.getPhoto_id());
        holder.person_img1.setImageResource(movie.getPhoto_id1());
        holder.person_img2.setImageResource(movie.getPhoto_id2());
    }



    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}