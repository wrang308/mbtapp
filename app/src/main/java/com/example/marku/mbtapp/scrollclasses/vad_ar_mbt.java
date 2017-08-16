package com.example.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.marku.mbtapp.MainActivity;
import com.example.marku.mbtapp.R;
import com.example.marku.mbtapp.Text.Text_praktisk_info;
import com.example.marku.mbtapp.Text.Text_vad_ar_mbt;
import com.example.marku.mbtapp.scroll;

/**
 * Created by marku on 2017-08-09.
 */

public class vad_ar_mbt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vad_ar_mbt);



        ImageButton button_back = (ImageButton) findViewById(R.id.vad_ar_mbt_button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vad_ar_mbt.this, scroll.class);
                startActivity(intent);
            }
        });


        final TextView text1234 = (TextView) findViewById(R.id.text_vad_ar_mbt);

        final String vad_ar_mbt = Text_vad_ar_mbt.getText();
        text1234.setText(vad_ar_mbt);
    }
}
