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

        ModelFeed modelFeed = new ModelFeed(1,R.drawable.bbs, R.drawable.yatsa_boob, "Magic Mushroom in Bhutan",
                "Whatever it is – animal, vegetable or mineral – the fungus known scientifically as “Cordyceps Sinensis” and " +
                        "colloquially as yatsa gunbu, or “winter worm, summer grass”, has revolutionised the economy on the " +
                        "Tibetan plateau, where for about a decade now there’s been a crazy rush every summer to get up to the high" +
                        " altitude areas where it grows, dig out as many as possible and sell them for a small fortune into the Chinese " +
                        "medicine market.\n\n"+" Although prices vary from year to year, they’re said to have increased by something like 900% " +
                        "since 1997, and top quality specimens can fetch up to $90,000 a kilo in the auction houses of Singapore and" +
                        " Hong Kong.","10/11/2018");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(2, R.drawable.kuensel,0, "Girl dies after eating poisonous mushrooms.",
                "Accident: A 12-year-old girl from Gomdar in Samdrup Jongkhar died yesterday after consuming mushroom they " +
                        "had picked in the forest on April 16. Her mother and grandmother had also consumed the mushroom. Medical " +
                        "officials were able to save the two. The girl complained of a headache and started vomiting the next day " +
                        "but they did not go to basic health unit (BHU) assuming it was a common headache. However, both the mother " +
                        "and grandmother then developed the same symptoms.\n" +
                        "\n" +
                        "The family had consumed mushroom locally known as phoma, which according to the locals are edible. But on " +
                        "April 18, the girl’s health deteriorated and the mother took her to the BHU. From there, she was referred  " +
                        "to Samdrup jongkhar hospital, about 70km from the gewog. Medical officials could not save her but were able " +
                        "to save the mother and grandmother. This was first case of mushroom poisoning reported this year. Health " +
                        "officials are warning the public to not to eat unknown mushrooms especially during this time of the season.\n\n" +
                        "Meanwhile, Nu 10,000 was handed over to the deceased’s mother by His Majesty The King’s Kidu Office, " +
                        "a private company donated Nu 10,000, and a few officials volunteered to help cremate the body.\n","11/22/2019"
                );
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(3, R.drawable.rnr, R.drawable.karma_penjor,"Locals in Paro pick up Mushroom",
                "Mushrooms, to some extent, are a dangerous delicacy.  People have died for a good mushroom meal; some after " +
                        "consuming poisonous wild mushrooms and some from wild animals attack while mushroom-hunting.\n" +
                        "The best solution, some have thought, is to grow mushrooms at home.\n"+"Karma Penjor started mushroom " +
                        "farming as a hobby.\n" + "A former civil servant, he started growing mushrooms, while in service, for " +
                        "self consumption. \n"+"After he resigned, he set up a mushroom farm in Paro.  Since then his farm has been doing " +
                        "a brisk business.\n" +
                        "He farms mushroom on a meter-long oak tree logs kept inside sheds. Seeds are placed inside the logs and incubated for" +
                        " 10-12 months.\n" +
                        "“It requires a lot of patience,” said Karma. “Once you have inoculated the logs, we do not know if the mushrooms are " +
                        "actually growing inside or not.”\n" +
                        "Karma harvests around 400 kilograms of Shiitake mushroom, every year. He sells them to local resorts and hotels, and" +
                        " makes around Nu 20,000-30,000 a month.\n" +
                        "He is now planning to grow mushrooms on sawdust which he says is a better alternative since it is difficult to get " +
                        "tree logs.\n",
                "May 19, 2016");
        modelFeedArrayList.add(modelFeed);

        modelFeed = new ModelFeed(1,R.drawable.kuensel, 0, "Three in hospital after consuming poisonous" +
                " mushrooms",
                "Food poisoning: Three people are undergoing treatment at the national referral hospital in Thimphu after consuming poisonous mushroom.\n" +
                        "Five people of the nine who were on their way to Thimphu from Paro roasted wild mushrooms for lunch at Tsaluna in Thimphu at around 2:30pm on July 19.\n" +
                        "Ugyen Zam, 40, from Mongar, said that they picked the mushroom known locally as on the way.\n" +
                        "An hour after eating the mushrooms, they started feeling dizzy with headaches, got diarrhoea and started throwing up.\n" +
                        "“I felt like I got drunk and couldn’t even recognise my friends,” Ugyen Zam said. “We were crawling and puking everywhere.”\n" +
                        "One of them called a taxi driver who took them to hospital.\n" +
                        "“We added garlic and Sichuan pepper to make sure the mushroom didn’t poison us,” Ugyen Zam said. “I had consumed the same mushroom several times but nothing happened to me then.”\n" +
                        "In April this year, a 12-year-old girl from Gomdar in Samdrupjongkhar died after consuming poisonous mushrooms\n","10/11/2018");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }
}
