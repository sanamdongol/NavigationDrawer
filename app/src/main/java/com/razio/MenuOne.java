package com.razio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by sanam on 8/14/16.
 */
public class MenuOne extends Activity {

    ListView listView;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        listView = (ListView) findViewById(R.id.listView);

        adapter = ArrayAdapter.createFromResource(this, R.array.nav_drawer_items, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MenuOne.this, TabActivity.class);
                startActivity(intent);

            }
        });


    }
}

