package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class BollInspirationalActivity extends AppCompatActivity {

    private String[] bollInspi = {"9Ered22Xy4E",
            "d8me1GXijJA",
            "8DMF0U6xV78",
            "LQmHKl3oNu0",
            "8kMv5ssr6Dw"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bol_inspirational);


        CardView cd1 = (CardView) findViewById(R.id.bi1);
        CardView cd2 = (CardView) findViewById(R.id.bi2);
        CardView cd3 = (CardView) findViewById(R.id.bi3);
        CardView cd4 = (CardView) findViewById(R.id.bi4);
        CardView cd5 = (CardView) findViewById(R.id.bi5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollInspi[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollInspi[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollInspi[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollInspi[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BollInspirationalActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollInspi[4]);
                startActivity(i);

            }
        });

    }

}
