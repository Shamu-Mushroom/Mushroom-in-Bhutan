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

        ModelFeed modelFeed = new ModelFeed(1,R.drawable.ic_propic1, R.drawable.dawa_cover, "Dawa Nyuethyue Tshering",
                "Do you love mushrooms? You're not alone.","10/11/2018");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(2, R.drawable.ic_propic2,0, "Pema Loday",
                "Unfortunately, by default, DNS is usually slow and insecure. Your ISP, and anyone else listening in \n"+
                        " on the Internet, can see every site you visit and every app you use — even if their content is encrypted." +
                        " Creepily, some DNS providers sell data about your Internet activity or use it to target you with ads.","11/22/2019"
                );
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(3, R.drawable.ic_propic3, R.drawable.img_post1,"Tshering","hello",
                "12/12/1222");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(1,R.drawable.ic_propic1, R.drawable.dawa_cover, "Dawa Nyuethyue Tshering",
                "Do you love mushrooms? You're not alone.","10/11/2018");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(2, R.drawable.ic_propic2,0, "Pema Loday",
                "Unfortunately, by default, DNS is usually slow and insecure. Your ISP, and anyone else listening in \n"+
                        " on the Internet, can see every site you visit and every app you use — even if their content is encrypted." +
                        " Creepily, some DNS providers sell data about your Internet activity or use it to target you with ads.","11/22/2019"
        );
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(3, R.drawable.ic_propic3, R.drawable.img_post1,"Tshering","hello", "12/12/1222");

        adapterFeed.notifyDataSetChanged();
    }

}
