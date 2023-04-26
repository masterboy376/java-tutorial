package com.company;


public class FinallyBlock_85 {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e ){
            System.out.println(e);
        }
        finally{
            System.out.println("Clean up... Program ended");
        }
        System.out.println("Clean up... Program ended");// if try executes then this will not run bcoz it is not in finally block.
        return -1;
    }
    public static void main(String[] args) {
        /*try {
            int a = 5;
            int b = 0;
            int c = a/b;
        }
        catch(Exception e ){
            System.out.println(e);
        }
        finally{// here finally is useless
            System.out.println("Program ended");
        }*/
        System.out.println(greet());
        //--------------------------------------------------------------------------------------------------------------
        // quiz
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e ){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally, value of b = "+b);
            }
            b--;
        }
       //---------------------------------------------------------------------------------------------------------------
        try{
            System.out.println(58/7);
        }
        finally{
            System.out.println("done 1");
        }// -----------------------------> valid

        try{
            System.out.println(67/0);
        }
        finally{
            System.out.println("done 2");
        }// ------------------------------> valid
    }
}
