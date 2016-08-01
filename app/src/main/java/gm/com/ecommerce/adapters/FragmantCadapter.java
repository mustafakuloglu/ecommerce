
package gm.com.ecommerce.adapters;

        import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
        import android.widget.RatingBar;
        import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;
import gm.com.ecommerce.models.ItemDouble;

/**
 * Created by musta on 1.08.2016.
 */
public class FragmantCadapter extends RecyclerView.Adapter<FragmantCadapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView item_title;
        private TextView item_text;
        private TextView item_price;
        private ImageView item_icon;
        private RatingBar item_rating;
        private TextView item_title2;
        private TextView item_text2;
        private TextView item_price2;
        private ImageView item_icon2;
        private RatingBar item_rating2;
        private CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView)view.findViewById(R.id.fragment_c_card_view);
            item_title = (TextView)view.findViewById(R.id.item_title);
            item_text = (TextView)view.findViewById(R.id.item_text);
            item_icon = (ImageView)view.findViewById(R.id.item_icon);
            item_price=(TextView)view.findViewById(R.id.item_price);
            item_rating=(RatingBar)view.findViewById(R.id.ratingBar);
            item_title2 = (TextView)view.findViewById(R.id.item_title2);
            item_text2= (TextView)view.findViewById(R.id.item_text2);
            item_icon2= (ImageView)view.findViewById(R.id.item_icon2);
            item_price2=(TextView)view.findViewById(R.id.item_price2);
            item_rating2=(RatingBar)view.findViewById(R.id.ratingBar2);

        }
    }
    List<ItemDouble> list_item;
    public FragmantCadapter(List<ItemDouble> list_item) {

        this.list_item = list_item;
    }


    @Override
    public FragmantCadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_c_card, parent, false);

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
        holder.item_title2.setText(list_item.get(position).getTitle2());
        holder.item_text2.setText(list_item.get(position).getText2());
        holder.item_icon2.setImageResource(list_item.get(position).getPhoto_id2());
        holder.item_price2.setText(list_item.get(position).getPrice2());
        holder.item_rating2.setRating(list_item.get(position).getRate2());

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
