package com.missionarsbarnsapp.marku.mbtapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.gavor;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.lekar;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.mbt_plus;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.praktisk_info;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.vad_ar_mbt;


/**
 * Created by marku on 2017-08-04.
 */

public class scroll extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolllayout);


        Button button_vad_ar_mbt = (Button) findViewById(R.id.scrollbutton1);
        Button button_praktisk_info = (Button) findViewById(R.id.scrollbutton2);
        Button button_lekar = (Button) findViewById(R.id.scrollbutton3);
        Button button_mbt_plus = (Button) findViewById(R.id.scrollbutton4);
        Button button_gavor = (Button) findViewById(R.id.scrollbutton5);
        ImageButton button_back = (ImageButton) findViewById(R.id.scrollbutton_back);


        final TextView text = (TextView) findViewById(R.id.time);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button_vad_ar_mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll.this, vad_ar_mbt.class);
                startActivity(intent);
            }
        });


         button_praktisk_info.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(scroll.this, praktisk_info.class);
            startActivity(intent);
        }
         });


        button_lekar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll.this, lekar.class);
                startActivity(intent);
            }
        });

        button_mbt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll.this, mbt_plus.class);
                startActivity(intent);
            }
        });

        button_gavor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scroll.this, gavor.class);
                startActivity(intent);
            }
        });







    }


/**
 *
 * Tested to make backbutton in the menu at top
 *
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    */

}
