package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HolSadActivity extends AppCompatActivity{

    private String[] hollSad = {"hLQl3WQQoQ0",
            "KtlgYxa6BMU",
            "RBumgq5yVrA",
            "RB-RcX5DS5A",
            "rtOvBOTyX00"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_sad);


        CardView cd1 = (CardView) findViewById(R.id.hs1);
        CardView cd2 = (CardView) findViewById(R.id.hs2);
        CardView cd3 = (CardView) findViewById(R.id.hs3);
        CardView cd4 = (CardView) findViewById(R.id.hs4);
        CardView cd5 = (CardView) findViewById(R.id.hs5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollSad[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollSad[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollSad[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollSad[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HolSadActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollSad[4]);
                startActivity(i);

            }
        });
    }

}
