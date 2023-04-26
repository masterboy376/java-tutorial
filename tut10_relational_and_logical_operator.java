package com.company;

public class RelationAndLogicalOperators_17 {
    public static void main(String[] args) {
        //...logical operators...
        //--------------------------------------------------------------------------------------------------------------
        //1. AND operator
        //boolean a = true;
        //boolean b = false;
        //boolean c = false;
        int a1 = 6;
        boolean a = (a1 > 5);
        int b1 = 7;
        boolean b = (b1 > 8);
        boolean c = true;
        if (a && b && c) {//precedence:- left to right
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        //--------------------------------------------------------------------------------------------------------------
        //2. OR operator
        boolean x = false;
        boolean y = true;
        boolean z = true;
        if (c || b || a) {//precedence:- right to left
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        //--------------------------------------------------------------------------------------------------------------
        // NOT operaton
        boolean m =true;
        boolean n= false;
        System.out.print("not(m) is ");
        System.out.println(!m);
        System.out.print("not(n) is ");
        System.out.println(!n);

        //--------------------------------------------------------------------------------------------------------------
        // NOTE:- Relation operators in class name 'Conditionals_16'. So, plz check that out.

        // let
        System.out.print("test : ");
        int i1 = 7;
        boolean i = (i1>9);
        System.out.println(!i);

    }
}
