package com.company;

public class MethodOverloading_32 {
    //method 1
    static void change2(int []arr){// void return type
        arr[0] =98;
        arr[1] =98;
        arr[2] =98;
        arr[3] =98;
        arr[4] =98;
    }
    //------------------------------------------------------------------------------------------------------------------
    //method 2
    static void change1(int a){// void return type
        a = 98;
    }
    //------------------------------------------------------------------------------------------------------------------
    // method 3
    static void telljoke(){// void return type
        System.out.println("I invented a new world:"+"\n"+
                "plagiarism");
    }
//----------------------------------------------------------------------------------------------------------------------
    // method 4
    static void foo() {
        System.out.println("good morning");
    }
//----------------------------------------------------------------------------------------------------------------------
    // method 5
    static void foo(int a){
        System.out.println(a);
    }
//----------------------------------------------------------------------------------------------------------------------
    // method 6
    static void foo(int a, int b){
        System.out.println(a+b);
    }
    //==================================================================================================================
    // main method
    public static void main(String[] args) {
        // method 3
        telljoke();
//----------------------------------------------------------------------------------------------------------------------
        // method 2
        int[]marks={12,3,4,5,6};// in case of array
        //case 1: change in integer
        int x = 45;
        change1(x);
        System.out.println("the value of change after running change is: "+x); // nothing will change
//----------------------------------------------------------------------------------------------------------------------
        // method 1
        //case 2:  change in array
        change2(marks);
        System.out.println(" change in the value of marks[0] after running change2 is: "+ marks[0]);
        System.out.println(" change in the value of marks[1] after running change2 is: "+ marks[1]);
        System.out.println(" change in the value of marks[2] after running change2 is: "+ marks[2]);
        System.out.println(" change in the value of marks[3] after running change2 is: "+ marks[3]);
        System.out.println(" change in the value of marks[4] after running change2 is: "+ marks[4]);
        // values of array will change
//----------------------------------------------------------------------------------------------------------------------
        // method 4
        foo();
//----------------------------------------------------------------------------------------------------------------------
        // method 5
        int c = 7;
        foo(c);
//----------------------------------------------------------------------------------------------------------------------
        // method 6
        int c1 = 4;
        int c2 = 0;
        foo(c1,c2);
//----------------------------------------------------------------------------------------------------------------------
    }
} 
