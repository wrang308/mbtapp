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

        }
        return "";
    }


}
