package com.twistedx.yasser.fraglab;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class FragmentList extends ListFragment {

    private ArrayAdapter<String> listAdapter1;
    private String[] someCategories;
    private String TAG = "FragmentList";

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        someCategories = new String[]{"Computer Parts", "Food", "Phones", "Tablets", "Watches"};
        ArrayList<String> categoryArrayList = new ArrayList<String>();
        categoryArrayList.addAll(Arrays.asList(someCategories));
        listAdapter1 = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, categoryArrayList);
        setListAdapter(listAdapter1);
        // Inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView lv, View v, int position, long id) {
        System.out.println("yo");
        Log.i(TAG, "position: " + position);
        Log.i(TAG, "id: " + id);
        Log.i(TAG, "ListView: " + lv);
        Log.i(TAG, "View: " + v);
    }


}
