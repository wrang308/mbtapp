package com.example.marku.mbtapp.lekar.Text_lekar;

/**
 * Created by marku on 2017-08-15.
 */

public class switch_case {

    final Text_alskling_alskling alskling_alskling = new Text_alskling_alskling();
    final Text_kramleken kramleken = new Text_kramleken();
    final Text_flortleken flortleken = new Text_flortleken();
    final Text_djungeltelegrafen djungeltelegrafen = new Text_djungeltelegrafen();
    final Text_mafia mafia = new Text_mafia();
    final Text_solomon_acation solomon_acation = new Text_solomon_acation();
    final Text_toarullsleken toarullsleken = new Text_toarullsleken();
    final Text_kaptenen_kommer kaptenen_kommer = new Text_kaptenen_kommer();
    final Text_fruktsallad fruktsallad = new Text_fruktsallad();
    final Text_bubelibubeli_bu bubelibubeli_bu = new Text_bubelibubeli_bu();
    final Text_riding_pony riding_pony = new Text_riding_pony();
    final Text_ninja ninja = new Text_ninja();
    final Text_samurai samurai = new Text_samurai();
    final Text_skicka_kuddar skicka_kuddar = new Text_skicka_kuddar();
    final Text_nipon nipon = new Text_nipon();
    final Text_grannar grannar = new Text_grannar();
    final Text_greenpeace greenpeace = new Text_greenpeace();
    final Text_high_chaparall high_chaparall = new Text_high_chaparall();
    final Text_fotleken fotleken = new Text_fotleken();
    final Text_en_bla_vada en_bla_vada = new Text_en_bla_vada();




    public String Gettext(String s){

        switch (s) {
            case "Älskling Älskling": return alskling_alskling.getText_alskling_alskling();

            case "Kramleken": return kramleken.getText_kramleken();

            case "Flörtleken": return flortleken.getText_flortleken();

            case "Djungeltelegrafen": return djungeltelegrafen.getText_djugeltelegrafen();

            case "Mafia": return mafia.getText_mafia();

            case "Solomon acation": return solomon_acation.getText_solomon_acation();

            case "Toarullsleken": return toarullsleken.getText_toarullsleken();

            case "Kaptenen kommer": return kaptenen_kommer.getText_kaptenen_kommer();

            case "Fruktsallad": return fruktsallad.getText_fruktsallad();

            case "Bubelibubeli bu": return bubelibubeli_bu.getText_bubelibubeli_bu();

            case "Riding pony": return riding_pony.getText_riding_pony();

            case "Ninja": return ninja.getText_ninja();

            case "Samurai": return samurai.getText_samurai();

            case "Skicka kuddar": return skicka_kuddar.getText_skicka_kuddar();

            case "Nipon": return nipon.getText_nipon();

            case "Tycker du om dina grannar?": return grannar.getText_grannar();

            case "Greenpeace": return greenpeace.getText_greenpeace();

            case "High chaparall": return high_chaparall.getText_high_chaparall();

            case "Fotleken": return fotleken.getText_fotleken();

            case "En blå vadå?": return en_bla_vada.getText_en_bla_vada();

        }
        return "";
    }


}
