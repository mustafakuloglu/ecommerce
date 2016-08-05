package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;
import gm.com.ecommerce.models.ModelF;

/**
 * Created by Comert on 4.08.2016.
 */
public class AdapterF extends RecyclerView.Adapter<AdapterF.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textView15) TextView urun;
        @BindView(R.id.textView16) TextView lorem;
        @BindView(R.id.imageViewv) ImageView icon;
        @BindView(R.id.imageView13) ImageView shopping;
        @BindView(R.id.imageView14) ImageView navo;
        @BindView(R.id.imageView15) ImageView favo;


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);


        }
    }

    List<ModelF> list_movie;
    public AdapterF(List<ModelF> list_movie) {

        this.list_movie = list_movie;
    }


    @Override
    public AdapterF.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmentf_recyles, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelF movie = list_movie.get(position);
        holder.urun.setText(movie.geturun());
        holder.lorem.setText(movie.getlorem());
        holder.icon.setImageResource(movie.geticon());
        holder.navo.setImageResource(movie.getnavo());
        holder.favo.setImageResource(movie.getfavo());

    }

    @Override
    public int getItemCount() {
        return list_movie.size();
    }


}
