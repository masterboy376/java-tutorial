package com.company;


import java.util.Scanner;

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
// Custom Exceptions
class InvalidInputException extends Exception{
    @Override
    public String toString(){return "Invalid Input!";}
}
//----------------------------------------------------------------------------------------------------------------------
class NotDefinedException extends Exception{
    @Override
    public String toString(){return "Not Defined!";}
}
//----------------------------------------------------------------------------------------------------------------------
class MaxInputException extends Exception{
    @Override
    public String toString(){return "Max Input Reached(That is 100000)!";}
}
//----------------------------------------------------------------------------------------------------------------------
class MaxMultiplierException extends Exception{
    @Override
    public String toString(){return "Max Multiplier Limit Crossed(That is 7000)!";}
}
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
class CustomCalculator {
    public void Addition() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number1 for addition: ");
        double a1 = s.nextDouble();
        System.out.print("Enter number2 for addition: ");
        double a2 = s.nextDouble();
        if ((!(a1 <= 100000) || !(a2 <= 100000)) && (a1 == 8 || a1 == 9 || a2 == 8 || a2 == 9)){
            try {
                throw new MaxInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (!(a1 <= 100000) || !(a2 <= 100000)) {
            try {
                throw new MaxInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (a1 == 8 || a1 == 9 || a2 == 8 || a2 == 9) {
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else {
            System.out.println("Addition = " + (a1 + a2));
        }
        System.out.println(" ");
    }
//----------------------------------------------------------------------------------------------------------------------
    public void Subtraction() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number1 for subtraction: ");
        double s1 = s.nextDouble();
        System.out.print("Enter number2 for subtraction: ");
        double s2 = s.nextDouble();
        if((!(s1 <= 100000) || !(s2 <= 100000)) && (s1 == 8 || s1 == 9 || s2 == 8 || s2 == 9)){
            try {
                throw new MaxInputException();
            } catch (Exception e) {
                System.out.println("Error:" + e);
            }
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (!(s1 <= 100000) || !(s2 <= 100000)) {
            try {
                throw new MaxInputException();
            } catch (Exception e) {
                System.out.println("Error:" + e);
            }
        }
        else if (s1 == 8 || s1 == 9 || s2 == 8 || s2 == 9) {
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else {
            System.out.println("Subtraction = " + (s1 - s2));
        }
        System.out.println(" ");
    }
//----------------------------------------------------------------------------------------------------------------------
    public void Multiplication() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number1 for multiplication: ");
        double m1 = s.nextDouble();
        System.out.print("Enter number2 for multiplication: ");
        double m2 = s.nextDouble();
        if((!(m1 <= 7000) || !(m2 <= 7000)) && (m1 == 8 || m1 == 9 || m2 == 8 || m2 == 9)){
            try {
                throw new MaxMultiplierException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (!(m1 <= 7000) || !(m2 <= 7000)) {
            try {
                throw new MaxMultiplierException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (m1 == 8 || m1 == 9 || m2 == 8 || m2 == 9) {
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else {
            System.out.println("Multiplication = " + (m1 * m2));
        }
        System.out.println(" ");
    }
//----------------------------------------------------------------------------------------------------------------------
    public void Division() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double d1 = s.nextDouble();
        System.out.print("Enter denominator: ");
        double d2 = s.nextDouble();
        if((d2 == 0) || (d1 == 8 || d1 == 9 || d2 == 8 || d2 == 9)){
            try {
                throw new NotDefinedException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (d2 == 0) {
            try {
                throw new NotDefinedException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else if (d1 == 8 || d1 == 9 || d2 == 8 || d2 == 9) {
            try {
                throw new InvalidInputException();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        else {
            System.out.println("Division = "+ d1/d2);
        }
        System.out.println(" ");
    }
}
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    public class Exercise6_87 {
        public static void main(String[] args) {
        /*
        //--Question Statement--//
        YOU HAVE TO CREATE A CUSTOM CALCULATOR WITH FOLLOWING OPERATIONS:
         1. ADDITION
         2.SUBTRACTION
         3.MULTIPLICATION
         4.DIVISION
         WHICH THROWS THE FOLLOWING THROWS FOLLOWING EXCEPTION:
         1.INVALID INPUT EXCEPTION. if input is 8 or 9.
         2.CANNOT DIVIDE BY 0 EXCEPTION.
         3.MAX INPUT EXCEPTION.(MAX NUMBER: 100000)
         4.MAX MULTIPLIER REACHED EXCEPTION.(MAX MULTIPLIER: 7000)
        */
//======================================================================================================================
            CustomCalculator c = new CustomCalculator();
            c.Addition();
            c.Subtraction();
            c.Multiplication();
            c.Division();


        }
    }
