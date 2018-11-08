package com.example.deadpool.madminiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class HomemadeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelHomemade> modelHomemadeArrayList = new ArrayList<>();
    AdapterHomemade adapterHomemade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemade);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) findViewById(R.id.toolbarTitle);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterHomemade = new AdapterHomemade(this,modelHomemadeArrayList);
        recyclerView.setAdapter(adapterHomemade);

        populateRecyclerView();
    }

    public void populateRecyclerView(){

        ModelHomemade modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);
        modelHomemade = new ModelHomemade(R.drawable.oyster_1, "Oyster Mushroom","Details");
        modelHomemadeArrayList.add(modelHomemade);

        adapterHomemade.notifyDataSetChanged();
    }
}
