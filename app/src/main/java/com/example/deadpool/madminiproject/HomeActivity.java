package com.example.deadpool.madminiproject;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private CardView ediableM, non_ediableM, ed_preM, home_madeM, factsM;

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //write this to view full screen
        //requestWindowFeature(1);
        //getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_home);

        //setting non-rotatable only portrait mode only
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Defining Cards
        ediableM = (CardView) findViewById(R.id.ediable);
        non_ediableM = (CardView) findViewById(R.id.non_ediable);
        ed_preM = (CardView) findViewById(R.id.ediable_pre);
        home_madeM = (CardView) findViewById(R.id.home_made);
        factsM = (CardView) findViewById(R.id.facts);
        //add Click Listener to the cards
        ediableM.setOnClickListener(this);
        non_ediableM.setOnClickListener(this);
        ed_preM.setOnClickListener(this);
        home_madeM.setOnClickListener(this);
        factsM.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else {
            backToast = Toast.makeText(getBaseContext(),"Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about_team) {
            Intent intent = new Intent(getApplicationContext(), TeamActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent(getApplicationContext(), EdibleActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(getApplicationContext(), NonedibleActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_help_info) {
            Intent intent = new Intent(HomeActivity.this, PrequationActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(getApplicationContext(), HomushroomActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            //this is for share links to other
            Intent intent= new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "Your body here";
            String shareSub ="Your subject here";
            intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            intent.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(intent, "Share via"));

        } else if (id == R.id.nav_feedback) {
            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");
            Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "dawanyuethyuetshering111@gmail.com" });
            Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
            Email.putExtra(Intent.EXTRA_TEXT, "Write body here" + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
            return true;

        }else if (id == R.id.nav_about) {
            Intent intent = new Intent(getApplicationContext(), TeamActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.ediable:
                intent = new Intent(this, EdibleActivity.class);
                startActivity(intent);
                break;

            case R.id.non_ediable:
                intent = new Intent(this, NonedibleActivity.class);
                startActivity(intent);
                break;

            case R.id.ediable_pre:
                intent = new Intent(this, PrequationActivity.class);
                startActivity(intent);
                break;

            case R.id.home_made:
                intent = new Intent(this, HomushroomActivity.class);
                startActivity(intent);
                break;

            case R.id.facts:
                intent = new Intent(this, FactsActivity.class);
                startActivity(intent);
                break;
        }
    }
}
