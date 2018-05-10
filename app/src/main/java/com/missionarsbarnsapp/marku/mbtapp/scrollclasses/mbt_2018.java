package com.missionarsbarnsapp.marku.mbtapp.scrollclasses;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.missionarsbarnsapp.marku.mbtapp.MainActivity;
import com.missionarsbarnsapp.marku.mbtapp.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by marku on 2017-08-09.
 */

public class mbt_2018 extends AppCompatActivity{

    private static String string = "loading";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbt_2018);

        final TextView text1234 = (TextView) findViewById(R.id.text_mbt_2018);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("1");
                    String url = "http://www.mbt.se/mbt-2018";
                    System.out.println("2");
                    Document doc;
                    System.out.println("3");
                    doc = Jsoup.connect(url).get();
                    System.out.println("4");
                    doc.select("p").prepend("\\n\\n");
                    System.out.println("5");
                    doc.select("li").prepend("\\n\\n");
                    System.out.println("6");
                    Elements elements = doc.select("div[class=col-md-8 col-md-offset-2 page-content-wrap]");
                    System.out.println("7");
                    setString("");
                    System.out.println("8");
                    for (Element element: elements) {
                        concatString(element.text().replaceAll("\\\\n", "\n"));
                    }
                    System.out.println("test");
                } catch (IOException e){
                    setString("Oj då, det här var pinsamt. Vi kunde inte ladda ner infon. " +
                            "Ring vår tekniska support på 076-0596310 så fixar vi allt.");
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        final Handler handler=new Handler();
        handler.post(new Runnable(){
            @Override
            public void run() {
                // upadte textView here
                text1234.setText(gettextString());
                handler.postDelayed(this,1200); // set time here to refresh textView
            }
        });

        ImageButton button_back = (ImageButton) findViewById(R.id.mbt_2018_button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mbt_2018.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    void concatString (String s){
        string = string.concat(s);
    }

    public String gettextString() {
        return string;
    }

    private void setString ( String s){
        string = s;
    }
}
