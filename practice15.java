 package com.company;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.time.*;
public class PracticeSet_15and16_Advanced {
    public static void main(String[] args) {
        // prob 1
        ArrayList<String> ar = new ArrayList();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");
        for(Object o : ar){
            System.out.println(o);
        }
        for(String s : ar){
            System.out.println(s);
        }
        System.out.println(ar);
//----------------------------------------------------------------------------------------------------------------------
        // prob 2
        Date d = new Date(121,07,24,21,47,02);
        System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds());
//----------------------------------------------------------------------------------------------------------------------
        // prob 3
        Calendar c = Calendar.getInstance();
        c.set(121,07,24,21,47,02);
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));
//----------------------------------------------------------------------------------------------------------------------
        // prob 4
        LocalTime t = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH : mm : ss");// seconds of minute
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm : SS");// fraction of seconds
        String problemDate = t.format(dtf);
        String problemDate1 = t.format(dtf1);
        System.out.println(problemDate);
        System.out.println(problemDate1);
//----------------------------------------------------------------------------------------------------------------------
        // prob 5
        HashSet<Integer> s = new HashSet<>();
        s.add(6);
        s.add(6);
        s.add(500);
        s.add(8000);
        s.add(40000);
        s.add(6600000);
        s.add(69000000);
        s.add(960000000);
        s.add(300000000);
        System.out.println(s);
//----------------------------------------------------------------------------------------------------------------------
    }
}
