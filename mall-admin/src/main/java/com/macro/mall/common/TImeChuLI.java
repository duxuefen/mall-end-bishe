package com.macro.mall.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public  class TImeChuLI {

    public static String getYear(Date date){
        String year=null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = formatter.format(date);
        year=stringDate.substring(0,4);
        return year;
    }
    public static String getMonth(Date date){
        String month=null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int m = cal.get(Calendar.MONTH) + 1;
        month=String.valueOf(m);
        return month;
    }



}
