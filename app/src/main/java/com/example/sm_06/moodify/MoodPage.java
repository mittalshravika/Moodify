package com.example.sm_06.moodify;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.api.services.youtube.YouTube;

/**
 * Created by HP on 19-08-2017.
 */

public class MoodPage extends AppCompatActivity{

    private String choice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood_page);

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            choice = choice.concat(extras.getString("choice"));

        }

        ImageView happy = (ImageView)findViewById(R.id.happyMood);
        ImageView sad = (ImageView)findViewById(R.id.sadMood);
        ImageView classics = (ImageView)findViewById(R.id.classicsMood);
        ImageView inspirational = (ImageView)findViewById(R.id.inspirationalMood);
        ImageView romantic = (ImageView)findViewById(R.id.romanticMood);
        ImageView trap = (ImageView)findViewById(R.id.trapMood);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, CardViewActivity.class);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(MoodPage.this, HolHappyActivity.class);
                    startActivity(i);
                }
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, BolSadActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(MoodPage.this, HolSadActivity.class);
                    startActivity(i);
                }

            }
        });

        classics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, BolIClassicActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(MoodPage.this, HollClassicActivity.class);
                    startActivity(i);
                }

            }
        });

        inspirational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, BollInspirationalActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(MoodPage.this, HollInspirationalActivity.class);
                    startActivity(i);
                }
            }
        });

        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, BolRomanticActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(MoodPage.this, HolRomanticActivity.class);
                    startActivity(i);
                }
            }
        });

        trap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice.equals("1")) {
                    Intent i = new Intent(MoodPage.this, BolTrapActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent(MoodPage.this, HollTrapActivity.class);
                    startActivity(i);
                }

            }
        });



    }


}
