package com.company;


import java.util.ArrayList;
import java.util.Scanner;

class MyGenerics<T2, T1>{
    private T2 t2;
    private T1 t1;
    public MyGenerics(T2 t, T1 t1){
        this.t2 = t2;
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }
    public void set2T(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics_110 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("string");
        a.add(24);
        a.add(new Scanner(System.in));
        a.add('A');
        //int i = a.get(2); // error because it is not specified whether a only contains integer.
        int i = (int)a.get(0); // true, int is type parameter.
        System.out.println(i);

        ArrayList<Integer> a1 = new ArrayList<Integer>(); // Integer, here is generics.
        //ArrayList<int> a2 = new ArrayList<int>(); // error
        a1.add(15);
        a1.add(56);
        a1.add(986);
        a1.add(587);
        int i1 = a1.get(3); // no error because a1 on contains integer.
        System.out.println(i1);

        //--note--
        // Generics is used to specify what kind of elements are being stored in a array.
        
        //--------------------------------------------------------------------------------------------------------------
        // using custom generics
        MyGenerics<T2,T1> g1 = new MyGenerics(7,"hi");  
        T1 tm = g1.getT1();
        T2 tn = g1.getT2();
        System.out.println(tm);
        System.out.println(tn);
        MyGenerics<String,Integer> g2 = new MyGenerics("hi",7);
        String str = g2.getT2();
        int InT = g2.getT1();
        System.out.println(str);
        System.out.println(InT);
        MyGenerics<Integer, String> g3 = new MyGenerics(9,"hello");
        int INT = g3.getT2();
        String s = g3.getT1();
        System.out.println(INT);
        System.out.println(s);
        
    }
}
