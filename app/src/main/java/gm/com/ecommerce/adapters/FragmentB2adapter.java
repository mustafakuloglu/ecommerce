package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.PersonB2;

/**
 * Created by Comert on 2.08.2016.
 */
public class FragmentB2adapter extends RecyclerView.Adapter<FragmentB2adapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView pro;
        public TextView dolars;
        public ImageView icons;
        public ImageView navos;


        public ViewHolder(View view) {
            super(view);
            pro = (TextView) view.findViewById(R.id.pro);
            dolars = (TextView) view.findViewById(R.id.dolars);
            icons = (ImageView) view.findViewById(R.id.icons);
            navos = (ImageView) view.findViewById(R.id.navos);

        }
    }

    List<PersonB2> list_movie;

    public FragmentB2adapter(List<PersonB2> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public FragmentB2adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bfragment2recyle, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(FragmentB2adapter.ViewHolder holder, int position) {
        PersonB2 movie = list_movie.get(position);
        holder.pro.setText(movie.getpro());
        holder.dolars.setText(movie.getdolars());
        holder.icons.setImageResource(movie.geticons());
        holder.navos.setImageResource(movie.getnavos());
    }


    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}