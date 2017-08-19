package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class BolTrapActivity extends AppCompatActivity {

    private String[] bollTrap = {"CES32EOxiyw",
            "MmkDyU5RXO0",
            "8ImCpzmqyU",
            "s8XIgR5OGJc",
            "-Bm0-9VzIsY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trap);


        CardView cd1 = (CardView) findViewById(R.id.bt1);
        CardView cd2 = (CardView) findViewById(R.id.bt2);
        CardView cd3 = (CardView) findViewById(R.id.bt3);
        CardView cd4 = (CardView) findViewById(R.id.bt4);
        CardView cd5 = (CardView) findViewById(R.id.bt5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollTrap[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollTrap[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollTrap[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollTrap[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollTrap[4]);
                startActivity(i);

            }
        });

    }
}
