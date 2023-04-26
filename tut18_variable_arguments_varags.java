package com.company;

public class VariablesArguments_Varags_33 {
    /*//method 1
    static int sum(int a, int b){
        int z = a+b;
        return z;
    }
//----------------------------------------------------------------------------------------------------------------------
    //method 2
    static int sum(int a, int b, int c){
        int z = a+b;
        return z;
    }*/
//----------------------------------------------------------------------------------------------------------------------
    // Varags 1.0
    static int sum(int ... arr){
        // available as int[]arr;
        int result=0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
//----------------------------------------------------------------------------------------------------------------------
    //varags 2.0
    static int sum1(int x, int ... arr){
        // available as int[]arr;
        int result1=x;
        for(int a:arr){
            result1 += a;
        }
        return result1;
    }
//======================================================================================================================
    public static void main(String[] args) {
//======================================================================================================================
        //varags 1.0
        System.out.println(" welcome to Varags ");
        System.out.println(" the sum of 4 and 5 is "+sum(4,5));
        System.out.println(" the sum of 4, 7 and 5 is "+sum(4,5,7));
        System.out.println(" the sum of nothing is "+sum());

        //..............................................................................................................
        //varags 2.0
        int  x = 5;
        System.out.println(" the sum of nothing is "+sum1(x));// here x is necessary
    }
}
