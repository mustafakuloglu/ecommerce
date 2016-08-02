package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.FragD;

/**
 * Created by Comert on 2.08.2016.
 */
public class FragdAdapter extends RecyclerView.Adapter<FragdAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView urun;
        public TextView lorem;
        public ImageView icon;



        public ViewHolder(View view) {
            super(view);
            urun = (TextView)view.findViewById(R.id.urun);
            lorem = (TextView)view.findViewById(R.id.lorem);
            icon = (ImageView)view.findViewById(R.id.icon);

        }
    }

    List<FragD> list_movie;
    public FragdAdapter(List<FragD> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public FragdAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmentdview, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FragD movie = list_movie.get(position);
        holder.urun.setText(movie.geturun());
        holder.lorem.setText(movie.getLorem());
        holder.icon.setImageResource(movie.geticon());

    }

    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}


