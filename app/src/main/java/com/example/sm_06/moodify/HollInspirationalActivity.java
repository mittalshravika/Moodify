package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HollInspirationalActivity extends AppCompatActivity{

    private String[] hollInspi = {"fgXRzjlbbng",
            "MWASeaYuHZo",
            "1y6smkh6c-0",
            "papuvlVeZg8",
            "bMpFmHSgC4Q"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_inspirational);


        CardView cd1 = (CardView) findViewById(R.id.hi1);
        CardView cd2 = (CardView) findViewById(R.id.hi2);
        CardView cd3 = (CardView) findViewById(R.id.hi3);
        CardView cd4 = (CardView) findViewById(R.id.hi4);
        CardView cd5 = (CardView) findViewById(R.id.hi5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollInspi[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollInspi[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollInspi[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollInspi[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollInspi[4]);
                startActivity(i);

            }
        });
    }


}
