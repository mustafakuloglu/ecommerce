

package gm.com.ecommerce.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.Item;

/**
 * Created by musta on 1.08.2016.
 */
public class ActivityNAdapter extends RecyclerView.Adapter<ActivityNAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView item_title;
        private TextView item_text;
        private TextView item_price;
        private ImageView item_icon;
        private RatingBar item_rating;


        public ViewHolder(View view) {
            super(view);

            item_title = (TextView)view.findViewById(R.id.item_titlen);
            item_text = (TextView)view.findViewById(R.id.item_textn);
            item_icon = (ImageView)view.findViewById(R.id.item_iconn);
            item_price=(TextView)view.findViewById(R.id.item_pricen);
            item_rating=(RatingBar)view.findViewById(R.id.ratingBarn);

        }
    }
    List<Item> list_item;
    public ActivityNAdapter(List<Item> list_item) {

        this.list_item = list_item;
    }


    @Override
    public ActivityNAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.n_recyleview, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.item_title.setText(list_item.get(position).getTitle());
        holder.item_text.setText(list_item.get(position).getText());
        holder.item_icon.setImageResource(list_item.get(position).getPhoto_id());
        holder.item_price.setText(list_item.get(position).getPrice());
        holder.item_rating.setRating(list_item.get(position).getRate());

    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



}
