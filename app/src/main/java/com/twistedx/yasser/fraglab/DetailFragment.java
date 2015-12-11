package com.twistedx.yasser.fraglab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment implements AdapterView.OnItemClickListener {

    int position = 0;
    int list = 0;
    private ListView lv;
    private ArrayAdapter<String> listAdapter1;
    private String[] productNames;
    private Intent intent;
    private Context context;

    public DetailFragment() {
        // Required empty public constructor
    }

    public void setList(String[] list, int p) {

        productNames = list;
        position = p;
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = inflater.getContext();
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        lv = (ListView) view.findViewById(R.id.secondList);
        //The array of different products depending on the list^^

        ArrayList<String> productArrayList = new ArrayList<String>();
        productArrayList.addAll(Arrays.asList(productNames));
        listAdapter1 = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, productArrayList);
        lv.setAdapter(listAdapter1);
        lv.setOnItemClickListener(this);

        }


    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

        if (position == 0) {

            switch (pos) {
                case 0:
                    intent = new Intent(context, CompCase.class);
                    break;
                case 1:
                    intent = new Intent(context, CPU.class);
                    break;
                case 2:
                    intent = new Intent(context, FuryX.class);
                    break;
                case 3:
                    intent = new Intent(context, LCK.class);
                    break;
                case 4:
                    intent = new Intent(context, MotherBoard.class);
                    break;
                case 5:
                    intent = new Intent(context, PCIeSSD.class);
                    break;
                case 6:
                    intent = new Intent(context, Power.class);
                    break;
                case 7:
                    intent = new Intent(context, RAM.class);
                    break;
                case 8:
                    intent = new Intent(context, SSD.class);
                    break;
                case 9:
                    intent = new Intent(context, Titan.class);
                    break;
            }
        }


        if (position == 1) {
            switch (pos) {
                case 0:
                    intent = new Intent(context, AppleJuice.class);
                    break;
                case 1:
                    intent = new Intent(context, Apples.class);
                    break;
                case 2:
                    intent = new Intent(context, Banana.class);
                    break;
                case 3:
                    intent = new Intent(context, Chips.class);
                    break;
                case 4:
                    intent = new Intent(context,CocaCola.class);
                    break;
                case 5:
                    intent = new Intent(context, Orange.class);
                    break;
                case 6:
                    intent = new Intent(context, Potato.class);
                    break;
                case 7:
                    intent = new Intent(context, Spaghetti.class);
                    break;
                case 8:
                    intent = new Intent(context, Sprite.class);
                    break;
                case 9:
                    intent = new Intent(context, Water.class);
                    break;
            }
        }
        if (position == 2) {
            switch (pos) {
                case 0:
                    intent = new Intent(context, GalaxyS6Edge.class);
                    break;
                case 1:
                    intent = new Intent(context, HTCM9.class);
                    break;
                case 2:
                    intent = new Intent(context, iPhone6s.class);
                    break;
                case 3:
                    intent = new Intent(context, Phone.class);
                    break;
            }
        }
        if (position == 3){
            switch (pos) {
                case 0:
                    intent = new Intent(context, iPadAir2.class);
                    break;
                case 1:
                    intent = new Intent(context, iPadmini4.class);
                    break;
                case 2:
                    intent = new Intent(context, SurfacePro4.class);
                    break;
            }
    }
        if (position == 4) {

            switch (pos) {
                case 0:
                    intent = new Intent(context, AppleWatch.class);
                    break;
                case 1:
                    intent = new Intent(context, GearS2.class);
                    break;
                case 2:
                    intent = new Intent(context, Watch.class);
                    break;
            }
        }

        startActivity(intent);

    }


}
