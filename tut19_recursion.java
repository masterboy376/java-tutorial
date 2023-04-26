package com.company;

import java.util.Scanner;
public class JavaRecursion_34 {
    //method1
    // FACTORIAL function in java.
    static long factorial(long n){
        //(n)!=(n-1)!
        //(0)!=1
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }
//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
//======================================================================================================================
        Scanner s = new Scanner(System.in);
        System.out.print("enter number to calculate factorial: ");
        long a = s.nextLong();
        long result = factorial(a);
        System.out.print(" factorial using recursion: ");
        System.out.println(result);
    //------------------------------------------------------------------------------------------------------------------
        long product = 1;// same input as above
        for(long i = 1;i<=a;i++){
            product = product*i;
        }
        System.out.print(" factorial using for loop: ");
        System.out.println(product);
    //------------------------------------------------------------------------------------------------------------------

    }
}
