package com.company;

import java.util.Scanner;
import java.util.Random;

class game{
     public int i;
     public int r;
    public void randomno(){
        Random ran = new Random(100);
        r = ran.nextInt(100);
    }
    public void inputno(){
        System.out.print("Enter your input here:- ");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
    }
    public boolean start(){
            if (r < i) {
                System.out.println("FAILED! Random is lower than your input.");
                return false;
            } else if (r > i) {
                System.out.println("FAILED! Random is greater than your input.");
                return false;
            } else if (r < 0 || r > 99) {
                System.out.println("Invalid input.");
                return false;
            } else {
                System.out.println("Congratulations! you won.");
                return true;
            }

    }
}
//----------------------------------------------------------------------------------------------------------------------
public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("Guess the random number between 0 and 99.");
        System.out.println("You have ten chances for guessing");
        game g = new game();
        g.randomno();
        boolean b =false;
        while(!b){
            g.inputno();
            b = g.start();
        }
       /* //1
        g.inputno();
        g.start();
        //2
        g.inputno();
        g.start();
        //3
        g.inputno();
        g.start();
        //4
        g.inputno();
        g.start();
        //5
        g.inputno();
        g.start();
        //6
        g.inputno();
        g.start();
        //7
        g.inputno();
        g.start();
        //8
        g.inputno();
        g.start();
        //9
        g.inputno();
        g.start();
        //10
        g.inputno();
        g.start(); */

    }
}
