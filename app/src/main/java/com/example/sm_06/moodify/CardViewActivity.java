package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by HP on 19-08-2017.
 */

public class CardViewActivity extends AppCompatActivity{

    private String[] bollHappy = {"MyHYCv7SzRE",
            "oZ7PnR_ZKRE",
            "WnU0lH6C0EA",
            "Sj9P6mmfCL4",
            "QYO6AlxiRE4"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view);


        CardView cd1 = (CardView) findViewById(R.id.bh1);
        CardView cd2 = (CardView) findViewById(R.id.bh2);
        CardView cd3 = (CardView) findViewById(R.id.bh3);
        CardView cd4 = (CardView) findViewById(R.id.bh4);
        CardView cd5 = (CardView) findViewById(R.id.bh5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollHappy[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollHappy[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollHappy[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollHappy[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CardViewActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollHappy[4]);
                startActivity(i);

            }
        });
    }
}
