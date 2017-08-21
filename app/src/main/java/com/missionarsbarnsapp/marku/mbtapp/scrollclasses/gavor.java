package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.R;
import com.missionarsbarnsapp.marku.mbtapp.Text.Text_gavor;
import com.missionarsbarnsapp.marku.mbtapp.scroll;

/**
 * Created by marku on 2017-08-10.
 */

public class gavor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gavor);


        final TextView text_gavor = (TextView) findViewById(R.id.text_gavor);

        final String gavor = Text_gavor.getText_gavor();
        text_gavor.setText(gavor);


        ImageButton button_back = (ImageButton) findViewById(R.id.gavor_button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gavor.this, scroll.class);
                startActivity(intent);
            }
        });
    }
}
