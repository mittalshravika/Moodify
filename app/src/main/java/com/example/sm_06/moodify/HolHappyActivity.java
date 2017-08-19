package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HolHappyActivity extends AppCompatActivity {

    private String[] hollHappy = {"1G4isv_Fylg",
            "y6Sxv-sUYtM",
            "e-fA-gBCkj0",
            "psuRGfAaju4",
            "Y66j_BUCBMY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_happy);


        CardView cd1 = (CardView) findViewById(R.id.hh1);
        CardView cd2 = (CardView) findViewById(R.id.hh2);
        CardView cd3 = (CardView) findViewById(R.id.hh3);
        CardView cd4 = (CardView) findViewById(R.id.hh4);
        CardView cd5 = (CardView) findViewById(R.id.hh5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolHappyActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollHappy[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolHappyActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollHappy[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolHappyActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollHappy[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolHappyActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollHappy[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolHappyActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollHappy[4]);
                startActivity(i);

            }
        });
    }
}
