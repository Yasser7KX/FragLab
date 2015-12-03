package com.twistedx.yasser.fraglab;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;
    private String [] someColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = (ListView) findViewById(R.id.listView);
        someColors = new String[]{"GeForce Titan X", "Core I7 Skylake", "ROG Motherboard", "Intel 750 SSD", "Corsair Liquid Cooler", "CM Case", "Windows 10"};
        ArrayList<String> colorArrayList = new ArrayList<String>();
        colorArrayList.addAll(Arrays.asList(someColors));
        listAdapter1 = new ArrayAdapter<String>(this, R.layout.fragment_list, colorArrayList);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("MainActivity", "position: " + position);
        DetailFragment df = new DetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        df.setPosition(position);
        ft.replace(R.id.fragment_container, df);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }
}