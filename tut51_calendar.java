package com.company;


import java.time.MonthDay;
import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass_98 {
    public static void main(String[] args) {
        //Calender class is a abstract class.
         Calendar c1 = Calendar.getInstance();
         System.out.println(c1.getCalendarType());
         System.out.println(c1.getWeekYear());
         System.out.println(c1.getTimeZone());

         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
         System.out.println(c.getCalendarType());
         System.out.println(c.getWeekYear());
         System.out.println(c.getTimeZone());
    }
}
