package com.company;


import java.util.TimeZone;

public class TimeZoneClass_99 {
    public static void main(String[] args) {
        System.out.println(TimeZone.getDefault());
        for(int i = 0 ; true ; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }

    }
}
