package com.company;


import java.util.Scanner;

public class NestedTryCatch_82 {
    public static void main(String[] args) {
        // quick quiz
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
        System.out.println("Enter the array index");
        int ind = s.nextInt();
            try {
                System.out.println("hello");
                try {
                    System.out.println(arr[ind]);
                    flag = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exists");
                    System.out.println(" Exception in nested try-catch block");
                }
            } catch (Exception e) {
                System.out.println("Exception in main try-catch block");
            }
        }
        System.out.println("thanks");
    }
}
