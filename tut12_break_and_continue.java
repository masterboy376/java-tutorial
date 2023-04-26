package com.company;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {
        // Break and Continue using loops
        // 1.Break
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        //..............................................................................................................
        int a = 0;
        while(a<5){
            System.out.println(a);
            System.out.println("Java is great");
            if(a==2){
                System.out.println("Ending the loop");
                break;
            }
            a++;
        }
        //..............................................................................................................
        int a1 = 0;
        do{
            System.out.println(a1);
            System.out.println("Java is great");
          if(a1==2){
              System.out.println("Ending the loop");
              break;
          }
          a1++;
        }while(a1<5);// understand the inner funtioning of codes.
        System.out.println("loop ends here");

        //--------------------------------------------------------------------------------------------------------------
        // 2.continue
        for(int i = 0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop(continue)");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
        //..............................................................................................................
        int i = 0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop(continue)");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i<5);
        System.out.println("loop ends here");
    }
}
