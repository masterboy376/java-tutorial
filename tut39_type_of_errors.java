package com.company;

import java.util.Scanner;

public class TypesOfError_78 {
    public static void main(String[] args) {
        //(1).......Syntax Error.......
        
        //--correct--
        int c = 4;
        int d = 9;
        //e= 9;//-->Syntax error
        System.out.println(c+d);
        
        //--error--
        //e =1;
        //OR
        //int f = 1
        
        //--------------------------------------------------------------------------------------------------------------
        
        //(2).......logical error.......
        
        //write a program to print all prime numbers between 1 and 10'
        
        //--error--
        // 9 is not a prime number
        System.out.println("Prime numbers between 1 and 10 :");
        System.out.println("1,2,");
        for (int i = 1; i<5;i++){
            System.out.print(2*i + 1+",");
        }
        
        //--correct--
        System.out.println("Prime numbers between 1 and 10 :");
        System.out.print("1,2,");
        for (int i = 1; i<5;i++){
            if(i==4){
                continue;
            }
            else if(i==3){
                System.out.print(2*i + 1);
            }
            else {
                System.out.print(2 * i + 1 + ",");
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        
        //(3).......Runtime error.........
        
        //--correct--
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.print("division = ");
        if(b==0){
            System.out.println("Not defined(Infinity)");
        }
        else{
            double result = a/b;
            System.out.println(result);
        }
        
        //--error--
        // will throw a error when b1 == 0.
        Scanner s1 = new Scanner(System.in);
        double a1 = s1.nextDouble();
        double b1 = s1.nextDouble();
        System.out.print("division = ");
        double result = a1/b1;
        System.out.println(result);
       
    }
}
