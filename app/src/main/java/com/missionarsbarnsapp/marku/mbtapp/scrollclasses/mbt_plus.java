package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.R;
import com.missionarsbarnsapp.marku.mbtapp.Text.Text_mbt_plus;
import com.missionarsbarnsapp.marku.mbtapp.scroll;

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

        ImageButton button_back = (ImageButton) findViewById(R.id.mbt_plus_button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mbt_plus.this, scroll.class);
                startActivity(intent);
            }
        });
    }

}
