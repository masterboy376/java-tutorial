package com.company;


import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return  "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
    @Override
    public void printStackTrace(){
        super.printStackTrace();
    }
}

public class ExceptionClass_83 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a<99){
            try {
                //throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
