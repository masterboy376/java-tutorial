package com.company;


public class Arrays_26 {
    public static void main(String[] args) {
        /*classroom of 5 students-you have to store the marks of these students.
        You have two options for this work:
        1. create 5 variables.
        2. use arrays*/

        //.....three ways of creating array.....

        //...1...declaration,memory allocation together and then initialisation.
        int[]marks= new int[5];
        marks[0]=100;
        marks[1]=98;
        marks[2]=97;
        marks[3]=95;
        marks[4]=92;
        //marks[5]=93;-throws an error
        System.out.println(marks[0]);

        //...2...declaration then memory allocation, and then initialisation.
        int[]mark;
        mark= new int[5];
        marks[0]=100;
        marks[1]=98;
        marks[2]=97;
        marks[3]=95;
        marks[4]=92;
        //marks[5]=93;-throws an error
        System.out.println(mark[1]);

        //...3...declaration, memory allocation, and initialising together.
        int[]marking= {100,98,97,95,92};
        System.out.println(marking[3]);

    }
}
