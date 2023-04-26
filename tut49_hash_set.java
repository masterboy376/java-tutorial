package com.company;


import java.util.HashSet;

public class HashSet_95 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(20,0.5f);
        h1.add(65);
        h1.add(60);
        h1.add(61);
        h1.add(62);
        h1.add(63);
        h1.add(64);
        System.out.println(h1);
        
    }
}
