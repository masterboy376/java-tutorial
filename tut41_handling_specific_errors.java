package com.company;


import java.util.Scanner;

public class HandlingSpecificError_81 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = s.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int num = s.nextInt();
        try{
            System.out.println("The value at array index entered is "+arr[ind]);
            System.out.println("The value of array value/number is "+arr[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e ){
            System.out.println("Some other exception occured");
            System.out.println(e);
        }

    }
}
