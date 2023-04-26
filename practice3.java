package com.company;

import java.util.Locale;

public class PracticeSet3 {
    public static void main(String[] args) {

        //...question 1...
        String name1 = "SaMbHaV";
        String ques1 = name1.toLowerCase();
        System.out.println(ques1);

        //...question 2...
        String name2 = " hi hello bye buffalo ";
        String ques2 = name2.replace(' ','_');
        System.out.println(ques2);

        //...question 3...
        String letter = "\" Dear <|name|>, thanks a lot\".";
        letter =  letter.replace("<|name|>","Sambhav");
        System.out.println(letter);

        //...question 4...
        String name4 = "This string contains  double  and triple spaces";
        int doublespace = name4.indexOf("  ");
        System.out.println(doublespace);
        int triplespace = name4.indexOf("   ");
        System.out.println(triplespace);
        // if any function returns '-1'then it means that substring dosenot exists in string.

        //...question 5...
        String name5 = "\"Dear Sambhav, this java cover is nice (Thanks a lot)\"";
        System.out.println(name5);
    }
}
