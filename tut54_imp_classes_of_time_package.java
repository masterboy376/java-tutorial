package com.company;


import java.time.*;

public class SomeBasicClassesOf_java_time_Package_100 {
    public static void main(String[] args) {
        //record time in second as well as in nano second. So, very accurate.
        //LocalDateTime d1 = new LocalDateTime(); -----> error bcoz we cannot change date or time in java.time package. So, no need for object here.

        // LocalDate
        LocalDate d = LocalDate.now();
        System.out.println(d);

        // LocalTime
        LocalTime t = LocalTime.now();
        System.out.println(t);

        // LocalDateTime
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
    }
}
