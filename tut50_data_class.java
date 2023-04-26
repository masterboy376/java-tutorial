package com.company;

import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.*;
public class DateClass_97 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.hashCode());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getSeconds());
        System.out.println(d.toInstant());
        System.out.println(d.toString());
        d.setTime(55345938593457575l);
        System.out.println(d.getTime());
    }
}
