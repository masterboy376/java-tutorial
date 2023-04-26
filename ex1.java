package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("CBSE board exam percentage calculator:- ");
        System.out.println("Note: please do not enter more than 100 marks*");
        Scanner s = new Scanner(System.in);
        System.out.print("Score of subject 1 :- ");
        float s1 = s.nextFloat();
        System.out.print("Score of subject 2 :- ");
        float s2 = s.nextFloat();
        System.out.print("Score of subject 3 :- ");
        float s3 = s.nextFloat();
        System.out.print("Score of subject 4 :- ");
        float s4 = s.nextFloat();
        System.out.print("Score of subjrct 5 :- ");
        float s5 = s.nextFloat();
        System.out.print("Score of subject 6 :- ");
        float s6 = s.nextFloat();
        float ts = s1+s2+s3+s4+s5+s6;
        float percentage = ts/6;
        System.out.print("Congratulations! You got ");
        System.out.print(percentage);
        System.out.println("%");
    }
}
