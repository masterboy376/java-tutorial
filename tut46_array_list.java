package com.company;


import java.util.*;

public class ArrayListAndMethods_91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 =new ArrayList<Integer>(5);// Generics-> <>
        ArrayList<Integer> l2 =new ArrayList<Integer>(5);// Generics-> <>

        l1.add(8);
        l1.add(7);
        l1.add(5);
        l1.add(0,7);// add()  // actually index = 1
        l1.add(0,9);// add() // actually index = 0
        l1.addAll(1,l2);// addAll element of l2 (from index 1) into l1
        System.out.println(l1.clone());// create clone
        //l1.clear();// clear all the elements of l1
        System.out.println(l1.contains(9));// checks whether l1 contains specified element
        l1.ensureCapacity(1000);// capacity rose to 1000
        System.out.println(l1.indexOf(7));//  indexOf first 7 will be printed
        System.out.println(l1.lastIndexOf(7));//  indexOf last 7 will be printed
        l1.set(1,56000);// set 56000 in 1 index
        l1.isEmpty();// true if l1 is empty
        System.out.println(l1.iterator());
        System.out.println(l1.listIterator());


        l2.add(0,0);
        l2.add(1,1);
        l2.add(2,2);
        l2.add(3,3);
        l2.add(4,4);

        for(int i =0; i<l1.size(); i++){// size()
            System.out.print(l1.get(i)+", ");// get()
        }

    }
}
