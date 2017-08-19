package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by HP on 19-08-2017.
 */

public class BolRomanticActivity extends AppCompatActivity {

    private String[] bollRomantic = {"zFdi834FiZ4",
            "xqsgnXWUA4M",
            "TGpG56pg3UU",
            "oyaudgo5_8Y",
            "Ei1RDCs6fOw"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bol_romantic);


        CardView cd1 = (CardView) findViewById(R.id.br1);
        CardView cd2 = (CardView) findViewById(R.id.br2);
        CardView cd3 = (CardView) findViewById(R.id.br3);
        CardView cd4 = (CardView) findViewById(R.id.br4);
        CardView cd5 = (CardView) findViewById(R.id.br5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollRomantic[0]);
                startActivity(i);

            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollRomantic[1]);
                startActivity(i);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollRomantic[2]);
                startActivity(i);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollRomantic[3]);
                startActivity(i);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BolRomanticActivity.this, PlayerActivity.class);
                i.putExtra("videoId", bollRomantic[4]);
                startActivity(i);

            }
        });

    }
}
