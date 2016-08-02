package gm.com.ecommerce.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.PersonB;


public class FragmentBadapter extends RecyclerView.Adapter<FragmentBadapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView urun;
        public TextView lorem;
        public TextView dolar;
        public ImageView icon;
        public ImageView shoppin;
        public ImageView favo;
        public ImageView navo;



        public ViewHolder(View view) {
            super(view);
            urun = (TextView)view.findViewById(R.id.urun);
            lorem = (TextView)view.findViewById(R.id.lorem);
            dolar = (TextView)view.findViewById(R.id.dolar);
            icon = (ImageView)view.findViewById(R.id.icon);
            shoppin = (ImageView)view.findViewById(R.id.shopppin);
            favo = (ImageView)view.findViewById(R.id.favo);
            navo = (ImageView)view.findViewById(R.id.navo);

        }
    }

    List<PersonB>list_movie;
    public FragmentBadapter(List<PersonB> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public FragmentBadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmentb_recyle, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(FragmentBadapter.ViewHolder holder, int position) {
        PersonB movie = list_movie.get(position);
        holder.urun.setText(movie.geturun());
        holder.lorem.setText(movie.getlorem());
        holder.dolar.setText(movie.getdolar());
        holder.icon.setImageResource(movie.geticon());
        holder.shoppin.setImageResource(movie.getshoppin());
        holder.favo.setImageResource(movie.getfavo());
        holder.navo.setImageResource(movie.getnavo());
    }



    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}