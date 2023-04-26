package com.company;

import java.util.Scanner;
public class PrcticeSet4 {
    public static void main(String[] args) {
        //...question 1...
        int a = 10;
        if(a == 11) {
            System.out.println(" i am 11");
        }
        else {
            System.out.println(" not 11");
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        //...question 2...
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks in physics:- ");
        byte p = s.nextByte();
        System.out.print("Enter your marks in mathematices:- ");
        byte m = s.nextByte();
        System.out.print("Enter your marks in chemistry:- ");
        byte c = s.nextByte();
        float avg = (p+m+c)/3.0f;
        System.out.println("Your overall percentage is:- "+avg);
        if(avg>=40 && p>=33 && m>= 33 && c>=33){
            System.out.println("\"Congratulations! You re pass.\"");
        }
        else{
            System.out.println("\"Unfortunatly, you are fail.\"");
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        //...question 3...
        Scanner s1 = new Scanner(System.in);
        float tax = 0f;
        System.out.print("Kindly, enter your income (in lakhs):- ");
        float income = s1.nextFloat();
        if(income<2.5f){
            tax = tax + 0;
        }
        else if(income>=2.5f && income<=5.0f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if(income>5.0f && income<=10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income-5f);
        }
        else if(income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
            System.out.println("you need to pay the tax of "+tax+" lakhs");
        System.out.println("--------------------------------------------------------------------------------------------");

        //...question 4...
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
        System.out.println("--------------------------------------------------------------------------------------------");

        //...question 5...
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter your year:- ");
        int year = s3.nextInt();
        boolean flag = false;
        if(year%400 == 0){
            //System.out.println("leap year");
            flag = true;
        }
        else if(year%100 == 0){
            //System.out.println("not a leap year");
            flag = false;
        }
        else if(year%4 ==0){
            //System.out.println("leap year");
            flag = true;
        }
        else{
            //System.out.println("not a leap year");
            flag = false;
        }
        if(flag == true){
            System.out.println("yes, it is a leap year");
        }
        else{
            System.out.println("no, it is not a leap year");
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        //...question 6...
        Scanner s4 = new Scanner(System.in);
        System.out.print("enter the name of website:- ");
        String website = s4.nextLine();
        if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("indian website");
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
