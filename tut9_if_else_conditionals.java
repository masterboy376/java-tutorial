package com.company;
import java.util.Scanner;
public class Conditionals_16 {
    public static void main(String[] args) {
        // if else conditionals
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        //boolean cond = (age>=18);
        if(age>=18){
            System.out.println("\"Yes! you can drive\"");
        }
        else if(age>12) {
            System.out.println("\"you can drive, but will be risky\"");
        }
        else {
            System.out.println("\"no, donot drive.\"");
        }// only one of will execute
        // one ladder ranges from if to else.
//----------------------------------------------------------------------------------------------------------------------
        // Switch conditionals(statements)
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your age here:- ");
        int a = s1.nextInt();

        switch(a){
            case 18:
                System.out.println("You are going to become adult!");

                break;
            case 23:
                System.out.println("You are going to get a job");
                break;
            case 60:
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy");
                break;

        }
        Scanner s2 = new Scanner(System.in);
        int daycode = s2.nextInt();
        switch(daycode){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
      
    }
}
