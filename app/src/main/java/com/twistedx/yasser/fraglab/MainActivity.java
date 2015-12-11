package com.twistedx.yasser.fraglab;



import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
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
    private String [] someCategories;
    private String[] productNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = (ListView) findViewById(R.id.listView);
        someCategories = new String[]{"Computer Parts", "Food", "Phones", "Tablets", "Watches"};
        ArrayList<String> categoryArrayList = new ArrayList<String>();
        categoryArrayList.addAll(Arrays.asList(someCategories));
        listAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryArrayList);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("MainActivity", "position: " + position);
        DetailFragment df = new DetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        int p = position;
        if (p == 0) productNames = getResources().getStringArray(R.array.ComputerParts);
        if (p == 1) productNames = getResources().getStringArray(R.array.Foods);
        if (p == 2) productNames = getResources().getStringArray(R.array.Phones);
        if (p == 3) productNames = getResources().getStringArray(R.array.Tablets);
        if (p == 4) productNames = getResources().getStringArray(R.array.Watches);
        df.setList(productNames, p);
        ft.replace(R.id.fragment_container, df);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_store1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cart:
                Intent intent = new Intent(this,Cart.class);
                startActivity(intent);
                return true;
            case R.id.credit:
                //Code to run when the Create Order item is clicked
                Intent intent2 = new Intent(this, credit.class);
                startActivity(intent2);
                return true;
            //Code to run when the Create Order item is clicked return true;
            case R.id.action_settings:
                //Code to run when the settings item is clicked return true;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}