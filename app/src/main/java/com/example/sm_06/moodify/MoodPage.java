package com.example.sm_06.moodify;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by HP on 19-08-2017.
 */

public class MoodPage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood_page);

        ImageView happy = (ImageView)findViewById(R.id.happyMood);
        ImageView sad = (ImageView)findViewById(R.id.sadMood);
        ImageView classics = (ImageView)findViewById(R.id.classicsMood);
        ImageView inspirational = (ImageView)findViewById(R.id.inspirationalMood);
        ImageView romantic = (ImageView)findViewById(R.id.romanticMood);
        ImageView trap = (ImageView)findViewById(R.id.trapMood);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        classics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        inspirational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        trap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
