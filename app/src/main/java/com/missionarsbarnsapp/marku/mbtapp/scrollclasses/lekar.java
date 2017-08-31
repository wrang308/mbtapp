package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.missionarsbarnsapp.marku.mbtapp.R;
import com.missionarsbarnsapp.marku.mbtapp.lekar.dod_ko;
import com.missionarsbarnsapp.marku.mbtapp.lekar.lekar_med_bara_text;
import com.missionarsbarnsapp.marku.mbtapp.scroll;

/**
 * Created by marku on 2017-08-07.
 */

public class lekar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lekar);

        ImageButton lekar_button_back = (ImageButton) findViewById(R.id.lekar_button_back);

        Button button_dod_ko = (Button) findViewById(R.id.button_lekar_dod_ko);
        Button button_alskling_alskling = (Button) findViewById(R.id.button_lekar_alskling_alskling);
        Button button_kramleken = (Button) findViewById(R.id.button_lekar_kramleken);
        Button button_flortleken = (Button) findViewById(R.id.button_lekar_flortleken);
        Button button_djungeltelegrafen = (Button) findViewById(R.id.button_lekar_djungeltelegrafen);
        Button button_mafia = (Button) findViewById(R.id.button_lekar_mafia);
        Button button_solomon_occasion = (Button) findViewById(R.id.button_lekar_solomon_occasion);
        Button button_toarullsleken = (Button) findViewById(R.id.button_lekar_toarullsleken);
        Button button_kaptenen_kommer = (Button) findViewById(R.id.button_lekar_kaptenen_kommer);
        Button button_fruktsallad = (Button) findViewById(R.id.button_lekar_fruktsallad);
        Button button_bubelibubeli_bu = (Button) findViewById(R.id.button_lekar_bubelibubeli_bu);
        Button button_riding_pony = (Button) findViewById(R.id.button_lekar_riding_pony);
        Button button_lasse_gar_i_ringen = (Button) findViewById(R.id.button_lekar_lasse_gar_i_ringen);
        Button button_ninja = (Button) findViewById(R.id.button_lekar_ninja);
        Button button_samurai = (Button) findViewById(R.id.button_lekar_samurai);
        Button button_skicka_kuddar = (Button) findViewById(R.id.button_lekar_skicka_kuddar);
        Button button_nipon = (Button) findViewById(R.id.button_lekar_nipon);
        Button button_grannar = (Button) findViewById(R.id.button_lekar_grannar);
        Button button_greenpeace = (Button) findViewById(R.id.button_lekar_greenpeace);
        Button button_high_chaparall = (Button) findViewById(R.id.button_lekar_high_chaparall);
        Button button_fotleken = (Button) findViewById(R.id.button_lekar_fotleken);
        Button button_en_bla_vada = (Button) findViewById(R.id.button_lekar_en_bla_vada);

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
                Intent intent = new Intent (lekar.this, lekar_med_bara_text.class);
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

        button_solomon_occasion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Solomon occasion");
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

        button_lasse_gar_i_ringen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Lasse går i ringen");
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

        button_skicka_kuddar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Skicka kuddar");
                startActivity(intent);
            }
        });

        button_nipon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Nipon");
                startActivity(intent);
            }
        });

        button_grannar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Tycker du om dina grannar?");
                startActivity(intent);
            }
        });

        button_greenpeace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Greenpeace");
                startActivity(intent);
            }
        });

        button_high_chaparall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "High chaparall");
                startActivity(intent);
            }
        });

        button_fotleken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "Fotleken");
                startActivity(intent);
            }
        });

        button_en_bla_vada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, lekar_med_bara_text.class);
                intent.putExtra("lek_title", "En blå vadå?");
                startActivity(intent);
            }
        });


        // BACK
        lekar_button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lekar.this, scroll.class);
                startActivity(intent);
            }
        });
    }
}
