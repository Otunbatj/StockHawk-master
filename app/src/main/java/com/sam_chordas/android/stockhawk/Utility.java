package com.sam_chordas.android.stockhawk;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Otunba on 9/21/2016.
 */
public class Utility {
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static String getFormattedDate(long dateInMillis ) {
        Locale localeUS = new Locale("en", "US");
        SimpleDateFormat queryDayFormat = new SimpleDateFormat(Utility.DATE_FORMAT,localeUS);
        return queryDayFormat.format(dateInMillis);
    }

    public static String getOneWeekBackDate(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -7);
//        Date newDate = cal.getTime();
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String getOneMonthBackDate(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -1);
//        Date newDate = cal.getTime();
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String getThreeMonthsBackDate(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -3);
//        Date newDate = cal.getTime();
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String getSixMonthsBackDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -6);
//        Date newDate = cal.getTime();
        return getFormattedDate(cal.getTimeInMillis());
    }

    public static String getOneYearBackDate(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, -1);
//        Date newDate = cal.getTime();
        return getFormattedDate(cal.getTimeInMillis());
    }
}
