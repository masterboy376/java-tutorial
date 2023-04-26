package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        byte x = 5;

        int y = 6;
        short z = 7;
        float a = 6.7f + x;//result ---> float or double
        //System.out.println(a);
        char c = 'A';
        int b = c+x;
        System.out.println(b);

        // Increment and decrement Operators // ++: increment ; --:decrement
        int i = 50;
        //int b = i++; // first b is assigned i then i is incremented.
        int j = 40;
        //int c = ++j; // first j is incremented then c is assigned j.
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // note
        char a = 'A';
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        // Quick quiz
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
    }
}
