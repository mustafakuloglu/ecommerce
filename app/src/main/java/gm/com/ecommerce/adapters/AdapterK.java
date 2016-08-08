package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;
import gm.com.ecommerce.models.ModelK;

/**
 * Created by Comert on 8.08.2016.
 */
public class AdapterK extends RecyclerView.Adapter<AdapterK.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ratingBar_list)
        RatingBar ratingBar;
        @BindView(R.id.user_l)TextView user;
        @BindView(R.id.time_l)TextView time;
        @BindView(R.id.commment_l)TextView comment;



        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);

        }
    }
    List<ModelK> list_model;
    public AdapterK(List<ModelK> list_person) {

        this.list_model = list_person;
    }


    @Override
    public AdapterK.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activityk_recyleview, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.comment.setText(list_model.get(position).getComment());
        holder.user.setText(list_model.get(position).getUser());
        holder.time.setText(list_model.get(position).getTime());
        holder.ratingBar.setRating(list_model.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return list_model.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



}
