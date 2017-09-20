package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.MainActivity;
import com.missionarsbarnsapp.marku.mbtapp.R;

/**
 * Created by marku on 2017-09-20.
 */

public class schema extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schema);


        final TextView text_schema = (TextView) findViewById(R.id.text_schema);


        text_schema.setText("Oj då, du var lite tidig");


        ImageButton schema_button_back = (ImageButton) findViewById(R.id.schema_button_back);

        schema_button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(schema.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
