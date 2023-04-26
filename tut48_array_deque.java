 package com.company;


import java.util.*;

public class ArrayDeque_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 =new ArrayDeque<>();// Generics-> <>
        ArrayDeque<Integer> l2 =new ArrayDeque<Integer>();// Generics-> <>

        l1.addLast(80);// added last in ArrayDeque
        l1.addFirst(70);// added first in ArrayDeque
        l1.add(8);
        l1.add(7);
        l1.add(5);
        System.out.println(l1.clone());// create clone
        //l1.clear();// clear all the elements of l1
        System.out.println(l1.contains(9));// checks whether l1 contains specified element

        l1.isEmpty();// true if l1 is empty
        System.out.println(l1.iterator());


        l2.add(0);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);


        System.out.println(l1.getFirst());
        System.out.println(l2.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l2.getLast());


    }
}
