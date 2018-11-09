package com.example.deadpool.madminiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TeamActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView dawa, karma, pema, tshering, kwang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //defining card view
        dawa = (CardView) findViewById(R.id.dawa);
        pema = (CardView) findViewById(R.id.pema);
        tshering = (CardView) findViewById(R.id.tshering);
        karma = (CardView) findViewById(R.id.karma);
        kwang = (CardView) findViewById(R.id.karmaWangchuk);

        //adding onclickListener to Card
        dawa.setOnClickListener(this);
        pema.setOnClickListener(this);
        karma.setOnClickListener(this);
        kwang.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()){
            case R.id.dawa:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.pema:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.karma:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.tshering:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.karmaWangchuk:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
