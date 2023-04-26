package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Stone->0, paper->1, scissor->2");
        System.out.print("Enter your choice here:- ");
        int a = s.nextInt();
        int b = r.nextInt(3);
        if(a==b){
            System.out.println("Draw!");
        }
       else if(a==0 && b==1){
            System.out.println("you lost!");
        }
       else if(a==1 && b==2){
            System.out.println("you lost!");
        }
       else if(a==2 && b==0){
            System.out.println("you lost!");
        }
       else{
            System.out.println("you won!");
        }
       if(a>3 || a<0){
           System.out.println("invalid input");
       }
       if(b==0){
           System.out.println("computer choose:- stone");
       }
       else if(b==1){
           System.out.println("computer choose:- paper");
       }
       else if(b==2){
           System.out.println("computer choose:- scissor");
       }
    }
}
