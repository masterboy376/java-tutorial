package com.company;

public class AssociativityOfOperators {
    public static void main(String[] args) {
// Precedence and Associativity
       // int a = 60*5-34/2;
        /*
        Highest precedence gosse to * and /. Thet are then evaluated on the basis of left to right associativity.
          =300-34/2
          =300-17
          =283
         */
       // System.out.println(a);

       // int b = 60/5-34*2;//Associativity : left to right for '*' & '/'
        /*
          =12-34*3
          =12-68
          =-56
         */
       // System.out.println(b);
//-----------------------------------------------------------------------------------------------------------------------------------------------------------//
        //------ Quick quiz ------- Check note book for questions

        //1
        int x = 5;
        int y = 7;
        int sol =x/2-y/2;
        System.out.println(sol);

        //2
        int a = 2;
        int b = 8;
        int c = 2;
        int exp = (b*b-4*a*c)/(2*a);
        System.out.println(exp);

        //3
        int v =7;
        int u =6;
        int eq = v*v-u*u;
        System.out.println(eq);

        //4
        int a1 = 4;
        int b1 = 6;
        int d1 = 2;
        int evaluate = a1*b1 - d1;
        System.out.println(evaluate);

    }
}
