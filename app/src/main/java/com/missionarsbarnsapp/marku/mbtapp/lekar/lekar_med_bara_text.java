package com.missionarsbarnsapp.marku.mbtapp.lekar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.R;
import com.missionarsbarnsapp.marku.mbtapp.lekar.Text_lekar.switch_case;
import com.missionarsbarnsapp.marku.mbtapp.scrollclasses.lekar;

/**
 * Created by marku on 2017-08-15.
 */

public class lekar_med_bara_text extends AppCompatActivity{

    String lekar_title = "";

    final switch_case switch_case = new switch_case();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lek_lekar_med_bara_text);

        ImageButton button_back = (ImageButton) findViewById(R.id.lekar_med_text_button_back);

        final TextView text_title = (TextView) findViewById(R.id.lekar_med_text_title);
        final TextView text_bread = (TextView) findViewById(R.id.text_lekar_med_text);

        lekar_title = getIntent().getStringExtra("lek_title");
        System.out.println(lekar_title);

        text_title.setText(lekar_title);
        text_bread.setText(switch_case.Gettext(lekar_title));


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar_med_bara_text.this, lekar.class);
                startActivity(intent);
            }
        });
    }

}
