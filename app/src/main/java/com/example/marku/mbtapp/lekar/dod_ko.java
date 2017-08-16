package com.example.marku.mbtapp.lekar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marku.mbtapp.R;

import org.w3c.dom.Text;

/**
 * Created by marku on 2017-08-07.
 */

public class dod_ko extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lek_dod_ko);

        final TextView dod_ko_bread_text = (TextView) findViewById(R.id.dod_ko_bread_text);
        dod_ko_bread_text.setText("Död ko är en lek är man ska vara en ko i olika sorters ställningar. En lekledare kommer säga " +
        "ut olika intruktioner om vilka ställningar man ska göra. Det olika ställningarna som finns som bilder längre ner är död ko, " +
        "stående ko, sittande ko, liggande ko och födande ko. Under födande ko ska man också låta som en födande ko. Om man misslyckas" +
        "eller är för långsam så åker man ut. Låt den bästa kon vinna");
    }

}
