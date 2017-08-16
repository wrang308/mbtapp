package com.example.marku.mbtapp.scrollclasses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marku.mbtapp.R;
import com.example.marku.mbtapp.Text.Text_gavor;
import com.example.marku.mbtapp.Text.Text_mbt_plus;

/**
 * Created by marku on 2017-08-10.
 */

public class mbt_plus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbt_plus);

        final TextView text_mbt_plus = (TextView) findViewById(R.id.text_mbt_plus);

        final String mbt_plus = Text_mbt_plus.getText_mbt_plus();
        text_mbt_plus.setText(mbt_plus);
    }

}
