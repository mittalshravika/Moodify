package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HollClassicActivity extends AppCompatActivity{

    private String[] hollClassic = {"vGJTaP6anOU",
            "h9ZGKALMMuc",
            "DVg2EJvvlF8",
            "PjFoQxjgbrs",
            "hwZNL7QVJjE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_classic);


        CardView cd1 = (CardView) findViewById(R.id.hc1);
        CardView cd2 = (CardView) findViewById(R.id.hc2);
        CardView cd3 = (CardView) findViewById(R.id.hc3);
        CardView cd4 = (CardView) findViewById(R.id.hc4);
        CardView cd5 = (CardView) findViewById(R.id.hc5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollClassic[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollClassic[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollClassic[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollClassic[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollClassic[4]);
                startActivity(i);

            }
        });
    }
}
