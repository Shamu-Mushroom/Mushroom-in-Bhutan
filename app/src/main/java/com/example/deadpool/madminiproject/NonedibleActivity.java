package com.example.deadpool.madminiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class NonedibleActivity extends AppCompatActivity {

    ListView listView;
    NonedibleListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<ModelNonedible> arrayList = new ArrayList<ModelNonedible>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonedible);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //listView
        title = new String[]{"Amanita", "Astraeus", "Golden Oyster", "Shiitake", "Oyster", "Enoki", "Portabello", "Porcini", "Morel"};
        description = new String[]{"Amanita Details", "Asteaeus Details", "སི་ལི་ཤ་མོང་།", "Shiitake detail...", "རྣ་སྐྱེས་ཤ་མོང་།","Enoki detail...","Portabello detail...","Porcini detail...","Morel detail..."};
        icon = new int[]{R.drawable.pine, R.drawable.chantterelle, R.drawable.crimini, R.drawable.shiitake, R.drawable.oyster, R.drawable.enoki, R.drawable.portabello, R.drawable.porcini, R.drawable.morel};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            ModelNonedible model = new ModelNonedible(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new NonedibleListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(getApplicationContext(), DawaActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.action_contact){
            Intent intent = new Intent(getApplicationContext(), PineActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ediable_option, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
}
