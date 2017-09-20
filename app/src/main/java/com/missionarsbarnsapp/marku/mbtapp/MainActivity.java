package com.missionarsbarnsapp.marku.mbtapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.gavor;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.lekar;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.mbt_2018;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.schema;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.vad_ar_mbt;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView text = (TextView) findViewById(R.id.time);

        Button button_menu_vad_ar_mbt = (Button)findViewById(R.id.button_menu_vad_ar_mbt);
        Button button_menu_mbt_2018 = (Button)findViewById(R.id.button_menu_mbt_2018);
        Button button_menu_lekar = (Button)findViewById(R.id.button_menu_lekar);
        Button button_menu_schema = (Button)findViewById(R.id.button_menu_schema);
        Button button_menu_gavor = (Button)findViewById(R.id.button_menu_gavor);
        Button button_menu_hemsida = (Button)findViewById(R.id.button_menu_hemsida);

        button_menu_vad_ar_mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vad_ar_mbt.class);
                startActivity(intent);
            }
        });

        button_menu_mbt_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mbt_2018.class);
                startActivity(intent);
            }
        });

        button_menu_lekar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, lekar.class);
                startActivity(intent);
            }
        });

        button_menu_schema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, schema.class);
                startActivity(intent);
            }
        });

        button_menu_gavor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, gavor.class);
                startActivity(intent);
            }
        });

        button_menu_hemsida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.mbt.se"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                final String timeString = time.updatetime();
                                text.setText(timeString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();


    }






}
