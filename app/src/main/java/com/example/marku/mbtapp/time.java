package com.example.marku.mbtapp;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by marku on 2017-05-03.
 */

public class time {

    public static String updatetime() {
        int SECONDS_IN_A_DAY = 24 * 60 * 60;

            Calendar thatDay = Calendar.getInstance();
            thatDay.setTime(new Date(0)); /* reset */
            thatDay.set(Calendar.DAY_OF_MONTH, 17);
            thatDay.set(Calendar.MONTH, 6); // 0-11 so 1 less
            thatDay.set(Calendar.YEAR, 2018);

            Calendar today = Calendar.getInstance();
            long diff = thatDay.getTimeInMillis() - today.getTimeInMillis();
            long diffSec = (diff / 1000) + 39600;
            long days = diffSec / SECONDS_IN_A_DAY;
            long secondsDay = diffSec % SECONDS_IN_A_DAY;
            long seconds = secondsDay % 60;
            long minutes = (secondsDay / 60) % 60;
            long hours = (secondsDay / 3600); // % 24 not needed

            System.out.printf("%d days, %d hours, %d minutes and %d seconds\n", days, hours, minutes, seconds);



            return(days + " dagar, " + hours + " timmar, \n" + minutes + " minuter, " + seconds + " sekunder \nkvar tills MBT 2018.");




    }
}
