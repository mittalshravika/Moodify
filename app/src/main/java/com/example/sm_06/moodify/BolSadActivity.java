package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class BolSadActivity extends AppCompatActivity {

    private String[] bollSad = {"aSV6IX7MwdU",
            "sK7riqg2mr4",
            "FJ55SHCzt88",
            "WPwTPhFMm3k",
            "ttIKsnxPrMY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bol_sad);


        CardView cd1 = (CardView) findViewById(R.id.bs1);
        CardView cd2 = (CardView) findViewById(R.id.bs2);
        CardView cd3 = (CardView) findViewById(R.id.bs3);
        CardView cd4 = (CardView) findViewById(R.id.bs4);
        CardView cd5 = (CardView) findViewById(R.id.bs5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollSad[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollSad[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollSad[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollSad[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollSad[4]);
                startActivity(i);

            }
        });

    }
}
