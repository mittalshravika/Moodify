package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HolRomanticActivity extends AppCompatActivity {

    private String[] hollRomantic = {"450p7goxZqg",
            "nSDgHBxUbVQ",
            "1UQzJfsT2eo",
            "lp-EO5I60KA",
            "7F37r50VUTQ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_romantic);


        CardView cd1 = (CardView) findViewById(R.id.hr1);
        CardView cd2 = (CardView) findViewById(R.id.hr2);
        CardView cd3 = (CardView) findViewById(R.id.hr3);
        CardView cd4 = (CardView) findViewById(R.id.hr4);
        CardView cd5 = (CardView) findViewById(R.id.hr5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollRomantic[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollRomantic[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollRomantic[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollRomantic[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollRomantic[4]);
                startActivity(i);

            }
        });
    }
}
