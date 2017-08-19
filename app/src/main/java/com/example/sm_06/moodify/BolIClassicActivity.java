package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class BolIClassicActivity extends AppCompatActivity {

    private String[] bollClassic = {"TFr6G5zveS8",
            "KqpIIaCJggY",
            "eJLdL5_QkVo",
            "IEwrLaCYQkg",
            "2rvoiBkDePY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bol_classic);


        CardView cd1 = (CardView) findViewById(R.id.bc1);
        CardView cd2 = (CardView) findViewById(R.id.bc2);
        CardView cd3 = (CardView) findViewById(R.id.bc3);
        CardView cd4 = (CardView) findViewById(R.id.bc4);
        CardView cd5 = (CardView) findViewById(R.id.bc5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolIClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollClassic[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolIClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollClassic[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolIClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollClassic[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolIClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollClassic[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolIClassicActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollClassic[4]);
                startActivity(i);

            }
        });

    }
}
