package com.example.marku.mbtapp.lekar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marku.mbtapp.R;
import com.example.marku.mbtapp.lekar.Text_lekar.switch_case;

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

        final TextView text_title = (TextView) findViewById(R.id.lekar_med_text_title);
        final TextView text_bread = (TextView) findViewById(R.id.text_lekar_med_text);

        lekar_title = getIntent().getStringExtra("lek_title");
        System.out.println(lekar_title);

        text_title.setText(lekar_title);
        text_bread.setText(switch_case.Gettext(lekar_title));

    }

}
