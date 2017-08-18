package com.example.sm_06.moodify;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

/**
 * Created by HP on 19-08-2017.
 */

public class HomePage extends AppCompatActivity{

    preferance obj = new preferance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);



        Button bt = (Button)findViewById(R.id.buttonBolly);
        Button bt2 = (Button)findViewById(R.id.buttonHolly);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.choice = 1;
                Intent i = new Intent(HomePage.this, MoodPage.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.choice = 2;
                Intent i = new Intent(HomePage.this, MoodPage.class);
                startActivity(i);
            }
        });


    }






}
