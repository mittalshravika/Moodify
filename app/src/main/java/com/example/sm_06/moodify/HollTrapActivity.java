package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class HollTrapActivity extends AppCompatActivity {

    private String[] hollTrap = {"CES32EOxiyw",
            "MmkDyU5RXO0",
            "I8ImCpzmqyU",
            "s8XIgR5OGJc",
            "-Bm0-9VzIsY"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hol_trap);


        CardView cd1 = (CardView) findViewById(R.id.ht1);
        CardView cd2 = (CardView) findViewById(R.id.ht2);
        CardView cd3 = (CardView) findViewById(R.id.ht3);
        CardView cd4 = (CardView) findViewById(R.id.ht4);
        CardView cd5 = (CardView) findViewById(R.id.ht5);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollTrap[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollTrap[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollTrap[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollTrap[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HollTrapActivity.this, PlayerActivity.class);
                i.putExtra("videoId", hollTrap[4]);
                startActivity(i);

            }
        });
    }


}
