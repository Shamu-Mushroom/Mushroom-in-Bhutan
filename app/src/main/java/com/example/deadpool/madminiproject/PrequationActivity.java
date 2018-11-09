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

public class PrequationActivity extends AppCompatActivity {

    ListView listView;
    PrequationListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<ModelPrequation> arrayList = new ArrayList<ModelPrequation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prequation);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //listView
        title = new String[]{"Phallus Impudicus", "Lyophyllum Mushroom", "Golden Oyster", "Oyster Mushroom", "Shiitake", "Enoki", "Portabello", "Porcini", "Morel"};
        description = new String[]{"Stink Horn", "བྱིས་ཤིང་རུ་རུ།", "སི་ལི་ཤ་མོང་།", "རྣ་སྐྱེས་ཤ་མོང་།", "Shiitake detail...","Enoki detail...","Portabello detail...","Porcini detail...","Morel detail..."};
        icon = new int[]{R.drawable.phallus_1, R.drawable.lyophyllum_1, R.drawable.oyster_1, R.drawable.oyster_1,R.drawable.shiitake, R.drawable.enoki, R.drawable.portabello, R.drawable.porcini, R.drawable.morel};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            ModelPrequation model = new ModelPrequation(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new PrequationListViewAdapter(this, arrayList);

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
