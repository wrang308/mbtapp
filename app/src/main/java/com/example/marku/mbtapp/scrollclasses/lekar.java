package com.example.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.marku.mbtapp.R;
import com.example.marku.mbtapp.lekar.dod_ko;
import com.example.marku.mbtapp.lekar.lekar_med_bara_text;
import com.example.marku.mbtapp.scroll;

/**
 * Created by marku on 2017-08-07.
 */

public class lekar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lekar);


        Button button_dod_ko = (Button) findViewById(R.id.button_lekar_dod_ko);
        Button button_alskling_alskling = (Button) findViewById(R.id.button_lekar_alskling_alskling);
        Button button_kramleken = (Button) findViewById(R.id.button_lekar_kramleken);
        Button button_flortleken = (Button) findViewById(R.id.button_lekar_flortleken);
        Button button_djungeltelegrafen = (Button) findViewById(R.id.button_lekar_djungeltelegrafen);
        Button button_mafia = (Button) findViewById(R.id.button_lekar_mafia);
        Button button_solomon_acation = (Button) findViewById(R.id.button_lekar_solomon_acation);
        Button button_toarullsleken = (Button) findViewById(R.id.button_lekar_toarullsleken);
        Button button_kaptenen_kommer = (Button) findViewById(R.id.button_lekar_kaptenen_kommer);
        Button button_fruktsallad = (Button) findViewById(R.id.button_lekar_fruktsallad);
        Button button_bubelibubeli_bu = (Button) findViewById(R.id.button_lekar_bubelibubeli_bu);
        Button button_riding_pony = (Button) findViewById(R.id.button_lekar_riding_pony);
        Button button_ninja = (Button) findViewById(R.id.button_lekar_ninja);
        Button button_samurai = (Button) findViewById(R.id.button_lekar_samurai);

        button_dod_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, dod_ko.class);
                startActivity(intent);
            }
        });

        button_alskling_alskling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Älskling Älskling");
                startActivity(intent);
            }
        });

        button_kramleken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Kramleken");
                startActivity(intent);
            }
        });

        button_flortleken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Flörtleken");
                startActivity(intent);
            }
        });

        button_djungeltelegrafen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Djungeltelegrafen");
                startActivity(intent);
            }
        });

        button_mafia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Mafia");
                startActivity(intent);
            }
        });

        button_solomon_acation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Solomon acation");
                startActivity(intent);
            }
        });

        button_toarullsleken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Toarullsleken");
                startActivity(intent);
            }
        });

        button_kaptenen_kommer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Kaptenen kommer");
                startActivity(intent);
            }
        });

        button_fruktsallad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Fruktsallad");
                startActivity(intent);
            }
        });

        button_bubelibubeli_bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Bubelibubeli bu");
                startActivity(intent);
            }
        });

        button_riding_pony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Riding pony");
                startActivity(intent);
            }
        });

        button_ninja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Ninja");
                startActivity(intent);
            }
        });

        button_samurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Samurai");
                startActivity(intent);
            }
        });
    }
}
