package gm.com.ecommerce.adapters;

//@BindView(R.id.title_g) TextView title;
//@BindView(R.id.price_g) TextView price;
//@BindView(R.id.photo_g) TextView photo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import gm.com.ecommerce.R;
import gm.com.ecommerce.models.ModelG;

/**
 * Created by musta on 4.08.2016.
 */
public class FragmentGAdapter  extends RecyclerView.Adapter<FragmentGAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title_g)TextView price;
        @BindView(R.id.price_g)TextView title;
        @BindView(R.id.photo_g)ImageView photo;


        public ViewHolder(View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.title_g);
            price = (TextView)view.findViewById(R.id.price_g);
            photo = (ImageView)view.findViewById(R.id.photo_g);
        }
    }
    List<ModelG> list_person;
    public FragmentGAdapter(List<ModelG> list_person) {

        this.list_person = list_person;
    }


    @Override
    public FragmentGAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_g_list, parent, false);

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
}
