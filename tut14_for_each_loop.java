package com.company;

import java.util.Scanner;
public class ForEachLoopInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[]marks=new float[5];
        System.out.print("Enter marks of suject 1:- ");
        marks[0]=s.nextFloat();
        System.out.print("Enter marks of suject 2:- ");
        marks[1]=s.nextFloat();
        System.out.print("Enter marks of suject 3:- ");
        marks[2]=s.nextFloat();
        System.out.print("Enter marks of suject 4:- ");
        marks[3]=s.nextFloat();
        System.out.print("Enter marks of suject 5:- ");
        marks[4]=s.nextFloat();

        String[]students={"sambhav","papa","mommy","priyam"};


        //...operation1...
        System.out.println(marks.length);
        System.out.println(students.length);


        //...operation2...
        System.out.println("using for loop");
        for(int i = 0;i<=4;i++){
            System.out.println(marks[i]);
        }
        //reverse order
        System.out.println("reverse order");
        for(int i = 4;i>=0;i--){
            System.out.println(marks[i]);
        }
        //or
        System.out.println("naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        //...operation3...
        System.out.println("using for-each loop");
        for(float element:marks){
            System.out.println(element);
        }
    }
}
