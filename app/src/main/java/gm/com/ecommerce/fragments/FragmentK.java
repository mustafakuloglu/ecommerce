package gm.com.ecommerce.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gm.com.ecommerce.R;

/**
 * Created by musta on 8.08.2016.
 */

public class FragmentK extends Fragment {
    private String title;
    private int page;
    static  int imageSrc;
    @BindView(R.id.image_slide_k)ImageView image;
    public static FragmentK newInstance(int page, String title,int image) {
        FragmentK fragmentFirst = new FragmentK();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        imageSrc=image;
        return fragmentFirst;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_k, container, false);
        ButterKnife.bind(this,view);
        image.setImageResource(imageSrc);
        return view;
    }
}
