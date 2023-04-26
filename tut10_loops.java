package com.company;

import java.util.Scanner;
public class WhileLoopControlInstruction_21 {
    public static void main(String[] args) {
        //...while loop...
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;// if i++ would not be here then this
        }
        System.out.println("finish");
        //--------------------------------------------------------------------------------------------------------------
        int a = 0;
        while(a<=70){
            System.out.println(a);
            a = a+7;
        }

        //...do-while loop...
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<5);//execute at least once, eventhough condition is false. But do not print if condition is false.
        //--------------------------------------------------------------------------------------------------------------
        int d = 1;
        do{
            System.out.println(d);
            d++;
        }while(d<=45);*/


        //...for loop...
        for(int c = 0;c<=10;c++){
            System.out.println(c);
        }
        //--------------------------------------------------------------------------------------------------------------
        Scanner s = new Scanner(System.in);
        System.out.print("How many odd no.:- ");
        int oddno = s.nextInt();
        for(int n = 0;n<oddno;n++){
            System.out.println(2*n+1);
        }
        //--------------------------------------------------------------------------------------------------------------
        for(int w=7;w!=0;w--){
            System.out.println(w);
        }
        //--------------------------------------------------------------------------------------------------------------
        Scanner s1 = new Scanner(System.in);
        System.out.println("input:- ");
        int m = s1.nextInt();
        for(int g = m ; g != 0 ; g--){
            System.out.println(g);
        }
    }
}
