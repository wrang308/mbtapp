package com.example.marku.mbtapp.scrollclasses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marku.mbtapp.R;
import com.example.marku.mbtapp.Text.Text_gavor;
import com.example.marku.mbtapp.Text.Text_praktisk_info;

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
    }
}
