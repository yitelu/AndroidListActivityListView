package com.ytl.androidlistactivitylistview;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    
    //Step 1 - define data - string array
    String[] data = {
            "Apple",
            "Samsung",
            "HTC",
            "Xiaomi",
            "LG",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "Dummy",
            "last item"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Step 2 - Define array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                data
        );


        //Step 3 - update adapter
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //crate intent

        //jump to another activity

    }
}
