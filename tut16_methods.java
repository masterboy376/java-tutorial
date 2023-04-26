package com.company;

public class MethodsJava_31 {
    static void telljoke(){// void return type
        System.out.println("I invented a new world:"+"\n"+
                "plagiarism");
    }
    //------------------------------------------------------------------------------------------------------------------
    // using methods
    /*//method1
    static int logics(int x, int y){
        int z;
        if(x>y){
            z = (x+y);
        }
        else{
            z=(x+y)*5;
        }
        x = 567;// it will not affect the working of method
        y = 56;// it will not affect the working of method
        return z;
    }*/
    //------------------------------------------------------------------------------------------------------------------
    //method2:- using object
    int logics(int x, int y){
        int z;
        if(x>y){
            z = (x+y);
        }
        else{
            z=(x+y)*5;
        }
        x = 567;// it will not affect the working of method
        y = 57;// it will not affect the working of method
        return z;
    }
    //------------------------------------------------------------------------------------------------------------------
    //method MAIN
    public static void main(String[] args) {
        MethodsJava_31 obj =new MethodsJava_31();// object creation for non static method


        /*// logic1
        int a = 5;
        int b = 7;
        int c = 0;
        if (a>b){
            c = (a+b);
        }
        else{
            c = (a+b)*5;
        }
        System.out.println(c);*/

                                                     //OR

        /*//logic1
        int a = 5;
        int b = 7;
        int c = logics(a,b);
        System.out.println(c);*/



        //logic1
        int a = 5;
        int b = 7;
        int c;
        c= obj.logics(a,b);
        System.out.println(c);
        //--------------------------------------------------------------------------------------------------------------
        /*// logic2
        int a1 = 15;
        int b1 = 7;
        int c1 = 0;
        if (a1>b1){
            c1 = (a1+b1);
        }
        else{
            c1 = (a1+b1)*5;
        }
        System.out.println(c1);*/

                                                      //OR

        /*//logic2
        int a1 = 5;
        int b1 = 7;
        int c1 = logics(a1,b1);
        System.out.println(c1);*/



        //logic2
        int a1 = 5;
        int b1 = 7;
        int c1;
        c1= obj.logics(a1,b1);
        System.out.println(c1);
        //------------------------------------------------------------------------------------------------------------//
        telljoke();//void return type
    }
}
