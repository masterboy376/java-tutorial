package com.company;


class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return  "Radius cannot be negative.";
    }
}

public class ThrowAndThrows_84 {
    // 1
    public static  double  Area (int r ) throws NegativeRadiusException {// throws -> give indication of Exception
        if(r<0){
            throw new NegativeRadiusException();// throw -> throw actual Exception
        }
        double result = Math.PI*r*r;
        return result;
    }
    //2
    public static int divide(int a, int b) throws ArithmeticException{
        // made by sam
        /*if(b==0){
            throw new ArithmeticException();
        }*/ // it do not matter here because ArithmeticException is a predefined Exception, and only executes when b==0.
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        // 1
        try {
            double area = Area(-8);
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
        // 2
        // tom  -  uses divide function created by sam.
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(Exception e ){
            System.out.println("Exception : "+e);
        }
    }
}
