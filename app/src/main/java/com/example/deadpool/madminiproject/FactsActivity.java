package com.example.deadpool.madminiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class FactsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelFeed> modelFeedArrayList = new ArrayList<>();
    AdapterFeed adapterFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) findViewById(R.id.toolbarTitle);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterFeed = new AdapterFeed(this, modelFeedArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();
    }

    public void populateRecyclerView() {

        ModelFeed modelFeed = new ModelFeed(1, 9, 2, R.drawable.ic_propic1, R.drawable.dawa_cover,
                "Nyuethyue Tshering", "10/10/2018", "The cars we drive say a lot about us.");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(2, 26, 6, R.drawable.ic_propic2, 0,
                "Pema Loday", "15/10/2018", "Do you love mushrooms? You're not alone. People have been enjoying mushrooms since the Cave Man days. Did you know that the \"Iceman\" discovered in the Italian Alps in 1991 (and thought to have died 5 000 years ago) was carrying dried mushrooms with him?");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(3, 17, 5, R.drawable.ic_propic3, R.drawable.img_post1,
                "Tshering Gyeltshen", "15/10/2018", "That reflection!!!");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(4, 26, 6, R.drawable.ic_propic2, 0,
                "Ugyen Lhamo", "15/10/2018", "Do you love mushrooms? You're not alone. People have been enjoying mushrooms since the Cave Man days. Did you know that the \"Iceman\" discovered in the Italian Alps in 1991 (and thought to have died 5 000 years ago) was carrying dried mushrooms with him?");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(5, 17, 5, R.drawable.ic_propic3, R.drawable.img_post2,
                "Karma Tashi", "15/10/2018", "That reflection!!!");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }

}
