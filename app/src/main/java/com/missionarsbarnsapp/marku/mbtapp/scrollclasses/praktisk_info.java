package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.R;
import com.missionarsbarnsapp.marku.mbtapp.Text.Text_praktisk_info;
import com.missionarsbarnsapp.marku.mbtapp.scroll;

/**
 * Created by marku on 2017-08-09.
 */

public class praktisk_info extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.praktisk_info);

        final TextView text1234 = (TextView) findViewById(R.id.text_praktisk_info);

        final String praktisk_info = Text_praktisk_info.getText();
        text1234.setText(praktisk_info);


        ImageButton button_back = (ImageButton) findViewById(R.id.praktisk_info_button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(praktisk_info.this, scroll.class);
                startActivity(intent);
            }
        });

    }





}
