package com.twistedx.yasser.fraglab;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.twistedx.yasser.fraglab.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    int position = 0;
    int image = 0;

    public DetailFragment() {
        // Required empty public constructor
    }

    public void setPosition(int p) {
        position = p;
        if (p == 0) image = R.drawable.cse;
        if (p == 1) image = R.drawable.furyx;
        if (p == 2) image = R.drawable.giph;
        if (p == 3) image = R.drawable.lck;
        if (p == 4) image = R.drawable.ram;
        if (p == 5) image = R.drawable.gtxtitan;
        if (p == 6) image = R.drawable.url;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            ImageView iv = (ImageView) view.findViewById(R.id.image);
            iv.setImageResource(image);
        }
    }


}
