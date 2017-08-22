package com.missionarsbarnsapp.marku.mbtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ImageButton button_previous;
    ImageButton button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = (Button) findViewById(R.id.button);
        final TextView text = (TextView) findViewById(R.id.time);

        viewFlipper = (ViewFlipper) findViewById(R.id.Viewflipper);
        button_previous = (ImageButton) findViewById(R.id.button_next);
        ImageButton button_next = (ImageButton) findViewById(R.id.button_previous);




        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewFlipper.showNext();
            }
        });

        button_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                viewFlipper.showPrevious();
            }
        });



        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, scroll.class);
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
