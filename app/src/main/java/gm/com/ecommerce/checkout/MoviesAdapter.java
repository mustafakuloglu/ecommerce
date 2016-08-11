package gm.com.ecommerce.checkout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView person_name;
        public TextView person_age;
        public ImageView person_img;



        public ViewHolder(View view) {
            super(view);
            person_name = (TextView)view.findViewById(R.id.person_name);
            person_age = (TextView)view.findViewById(R.id.person_age);
            person_img = (ImageView)view.findViewById(R.id.person_photo);

        }
    }

    List<Movie> list_movie;
    public MoviesAdapter(List<Movie> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public MoviesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_list, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = list_movie.get(position);
        holder.person_name.setText(movie.getName());
        holder.person_age.setText(movie.getProducts());
        holder.person_img.setImageResource(movie.getPhoto_id());

    }

    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}
