package gm.com.ecommerce.screenA;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import gm.com.ecommerce.R;

/**
 * Created by musta on 2.08.2016.
 */
public class FragmentAAdapter extends RecyclerView.Adapter<FragmentAAdapter.ViewHolder> {
    private Activity activity;

    private static ClickListener clickListener;
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView price;
        public TextView title;
        public ImageView photo;
        public ImageView more;



        public ViewHolder(View view) {
            super(view);

            final FragmentAAdapter fragmentAAdapter=FragmentAAdapter.this;
            title = (TextView)view.findViewById(R.id.title_a);
            price = (TextView)view.findViewById(R.id.price_a);
            photo = (ImageView)view.findViewById(R.id.photo_a);
            more = (ImageView)view.findViewById(R.id.imageView_a);

            view.setOnClickListener(this);

            more.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(), view);
        }
    }
    List<ItemA> list_person;
    public FragmentAAdapter(List<ItemA> list_person, Activity activity,IScreenAView screenAView) {
this.activity=activity;


        this.list_person = list_person;
    }


    @Override
    public FragmentAAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_a_card, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.title.setText(list_person.get(position).getTitle());
        holder.price.setText(list_person.get(position).getPrice());
        holder.photo.setImageResource(list_person.get(position).getPhoto_id());

    }

    @Override
    public int getItemCount() {
        return list_person.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    public interface ClickListener {
        void onItemClick(int position, View v);
        void onItemLongClick(int position, View v);
    }

}
